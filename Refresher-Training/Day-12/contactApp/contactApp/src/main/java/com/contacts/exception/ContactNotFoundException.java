package com.contacts.exception;

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException(Integer id) {
        super("Contact not found with id " + id);
    }
}
