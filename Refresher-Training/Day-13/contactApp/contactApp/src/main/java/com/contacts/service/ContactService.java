package com.contacts.service;

import java.util.List;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;

public interface ContactService {

    ContactResponseDto createContact(ContactRequestDto request);

    List<ContactResponseDto> getAllContacts();

    ContactResponseDto getContactById(Integer id);

    ContactResponseDto updateContact(Integer id, ContactRequestDto request);

    void deleteContact(Integer id);
}
