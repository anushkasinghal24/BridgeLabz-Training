package com.contacts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.security")
public record AppSecurityProperties(
        Jwt jwt,
        User admin,
        User user) {

    public record Jwt(String secret, long expirationMinutes) {
    }

    public record User(String username, String password) {
    }
}
