package com.contacts.exception;

public class DuplicateContactException extends RuntimeException {

    public DuplicateContactException(String field, String value) {
        super("Contact with " + field + " '" + value + "' already exists");
    }
}
