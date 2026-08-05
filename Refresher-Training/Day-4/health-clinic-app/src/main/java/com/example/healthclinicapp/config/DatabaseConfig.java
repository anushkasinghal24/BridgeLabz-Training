package com.example.healthclinicapp.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfig {

    private final String url;
    private final String user;
    private final String pass;

    public DatabaseConfig() {
        Properties properties = new Properties();
        loadProperties(properties, "application.properties");
        loadProperties(properties, "application-local.properties");

        this.url = firstNonBlank(
                System.getenv("DB_URL"),
                System.getProperty("db.url"),
                properties.getProperty("app.db.url"),
                "jdbc:mysql://localhost:3306/health_clinic_db"
        );
        this.user = firstNonBlank(
                System.getenv("DB_USER"),
                System.getProperty("db.user"),
                properties.getProperty("app.db.user"),
                "root"
        );
        this.pass = firstNonBlank(
                System.getenv("DB_PASS"),
                System.getProperty("db.pass"),
                properties.getProperty("app.db.pass"),
                ""
        );
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, pass);
    }

    private void loadProperties(Properties properties, String resourceName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourceName)) {
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException ignored) {
            // Fall back to environment variables/defaults when local properties cannot be read.
        }
    }

    private String firstNonBlank(String... values) {
        for (String value : values) {
            if (value != null && !value.trim().isEmpty()) {
                return value.trim();
            }
        }
        return "";
    }
}
