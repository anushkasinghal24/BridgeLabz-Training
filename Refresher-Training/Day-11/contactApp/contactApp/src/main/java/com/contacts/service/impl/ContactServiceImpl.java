package com.contacts.service.impl;

import java.util.List;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;
import com.contacts.entity.Contact;
import com.contacts.exception.ContactNotFoundException;
import com.contacts.mapper.ContactMapper;
import com.contacts.repository.ContactRepository;
import com.contacts.service.ContactService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactServiceImpl(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    @Override
    public ContactResponseDto createContact(ContactRequestDto request) {
        Contact contact = contactMapper.toEntity(request);
        return contactMapper.toResponse(contactRepository.save(contact));
    }

    @Override
    public List<ContactResponseDto> getAllContacts() {
        return contactRepository.findAll()
                .stream()
                .map(contactMapper::toResponse)
                .toList();
    }

    @Override
    public ContactResponseDto getContactById(Integer id) {
        return contactRepository.findById(id)
                .map(contactMapper::toResponse)
                .orElseThrow(() -> new ContactNotFoundException(id));
    }

    @Override
    public ContactResponseDto updateContact(Integer id, ContactRequestDto request) {
        Contact existing = contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException(id));

        existing.setName(request.getName());
        existing.setEmail(request.getEmail());
        existing.setMobNo(request.getMobNo());

        return contactMapper.toResponse(contactRepository.save(existing));
    }

    @Override
    public void deleteContact(Integer id) {
        Contact existing = contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException(id));
        contactRepository.delete(existing);
    }
}
