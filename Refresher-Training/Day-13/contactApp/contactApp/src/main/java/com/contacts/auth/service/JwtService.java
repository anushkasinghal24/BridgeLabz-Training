package com.contacts.auth.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.contacts.config.AppSecurityProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final String HEADER_JSON = "{\"alg\":\"HS256\",\"typ\":\"JWT\"}";

    private final AppSecurityProperties securityProperties;
    private final ObjectMapper objectMapper;
    private final SecretKeySpec keySpec;

    public JwtService(AppSecurityProperties securityProperties, ObjectMapper objectMapper) {
        this.securityProperties = securityProperties;
        this.objectMapper = objectMapper;
        this.keySpec = new SecretKeySpec(
                securityProperties.jwt().secret().getBytes(StandardCharsets.UTF_8),
                HMAC_ALGORITHM);
    }

    public String generateToken(UserDetails userDetails) {
        Instant now = Instant.now();
        Instant expiresAt = now.plusSeconds(securityProperties.jwt().expirationMinutes() * 60L);

        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .map(authority -> authority.startsWith("ROLE_") ? authority.substring("ROLE_".length()) : authority)
                .toList();

        Map<String, Object> claims = new LinkedHashMap<>();
        claims.put("sub", userDetails.getUsername());
        claims.put("roles", String.join(",", roles));
        claims.put("iat", now.getEpochSecond());
        claims.put("exp", expiresAt.getEpochSecond());

        String header = base64Url(HEADER_JSON.getBytes(StandardCharsets.UTF_8));
        String payload = base64Url(writeJson(claims));
        String signature = sign(header + "." + payload);
        return header + "." + payload + "." + signature;
    }

    public long getExpirationMinutes() {
        return securityProperties.jwt().expirationMinutes();
    }

    public String extractUsername(String token) {
        return getClaims(token).get("sub").toString();
    }

    public List<String> extractRoles(String token) {
        Object roles = getClaims(token).get("roles");
        if (roles == null || roles.toString().isBlank()) {
            return List.of();
        }
        return List.of(roles.toString().split(","));
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        Map<String, Object> claims = getClaims(token);
        if (!userDetails.getUsername().equals(claims.get("sub"))) {
            return false;
        }
        long expiration = Long.parseLong(claims.get("exp").toString());
        return Instant.now().getEpochSecond() < expiration;
    }

    private Map<String, Object> getClaims(String token) {
        String[] parts = token.split("\\.");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid JWT format");
        }

        String signedPart = parts[0] + "." + parts[1];
        String expectedSignature = sign(signedPart);
        if (!MessageDigest.isEqual(
                expectedSignature.getBytes(StandardCharsets.UTF_8),
                parts[2].getBytes(StandardCharsets.UTF_8))) {
            throw new IllegalArgumentException("Invalid JWT signature");
        }

        byte[] payloadBytes = Base64.getUrlDecoder().decode(parts[1]);
        return readJson(payloadBytes);
    }

    private String sign(String data) {
        try {
            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            mac.init(keySpec);
            return base64Url(mac.doFinal(data.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception ex) {
            throw new IllegalStateException("Unable to sign JWT", ex);
        }
    }

    private byte[] writeJson(Map<String, Object> claims) {
        try {
            return objectMapper.writeValueAsBytes(claims);
        } catch (Exception ex) {
            throw new IllegalStateException("Unable to serialize JWT claims", ex);
        }
    }

    private Map<String, Object> readJson(byte[] bytes) {
        try {
            return objectMapper.readValue(bytes, new TypeReference<>() {
            });
        } catch (Exception ex) {
            throw new IllegalStateException("Unable to parse JWT claims", ex);
        }
    }

    private String base64Url(byte[] bytes) {
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }
}
