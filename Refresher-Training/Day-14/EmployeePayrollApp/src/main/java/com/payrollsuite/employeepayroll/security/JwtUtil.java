package com.payrollsuite.employeepayroll.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Component
public class JwtUtil {

    private final String SECRET_KEY = "aswqhhvdhjcfdewhjhgedhfherfhbferhbhkwwfhrefbhfjhvygvyv";

    public SecretKey getSECRET_KEY(){
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String generateJwtToken(Authentication authentication){
        return Jwts.builder()
                .subject(authentication.getName())
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(
                        System.currentTimeMillis()+3600000
                ))
                .signWith(getSECRET_KEY())
                .compact();
    }

    public Claims extractJwtClaims(String token){
        Claims claims = Jwts.parser()
                .verifyWith(getSECRET_KEY())
                .build()
                .parseSignedClaims(token)
                .getPayload();

        return claims;
    }

}

