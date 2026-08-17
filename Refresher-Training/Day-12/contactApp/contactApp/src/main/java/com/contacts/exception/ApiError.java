package com.contacts.exception;

import java.time.Instant;

public record ApiError(
        String message,
        int status,
        String path,
        Instant timestamp) {
}
