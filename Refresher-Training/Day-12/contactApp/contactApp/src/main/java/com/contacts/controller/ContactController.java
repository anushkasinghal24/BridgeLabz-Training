package com.contacts.controller;

import java.util.List;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;
import com.contacts.service.ContactService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ContactResponseDto> create(@Valid @RequestBody ContactRequestDto request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contactService.createContact(request));
    }

    @GetMapping
    public ResponseEntity<List<ContactResponseDto>> getAll() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDto> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactResponseDto> update(
            @PathVariable Integer id,
            @Valid @RequestBody ContactRequestDto request) {
        return ResponseEntity.ok(contactService.updateContact(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
