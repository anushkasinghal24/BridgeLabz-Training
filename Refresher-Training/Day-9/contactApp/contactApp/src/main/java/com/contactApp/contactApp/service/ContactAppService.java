package com.contactApp.contactApp.service;

import com.contactApp.contactApp.DTO.ResponseDTO;
import com.contactApp.contactApp.entity.ContactApp;
import com.contactApp.contactApp.repository.ContactAppRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactAppService implements ContactAppInterface{

    private final ContactAppRepository contactAppRepository;

    public ContactAppService(ContactAppRepository contactAppRepository) {
        this.contactAppRepository = contactAppRepository;
    }

    @Override
    public ResponseDTO add(ContactApp contactAppReq){
        ContactApp cont = contactAppRepository.save(contactAppReq);
        return toResponse(cont);
    }

    @Override
    public List<ResponseDTO> getAll() {
        return contactAppRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    @Override
    public ResponseDTO getById(int id) {
        ContactApp contact = contactAppRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contact not found with id " + id));
        return toResponse(contact);
    }

    @Override
    public ResponseDTO update(int id, ContactApp contactAppReq) {
        ContactApp existing = contactAppRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contact not found with id " + id));

        existing.setName(contactAppReq.getName());
        existing.setEmail(contactAppReq.getEmail());
        existing.setMobNo(contactAppReq.getMobNo());

        return toResponse(contactAppRepository.save(existing));
    }

    @Override
    public void delete(int id) {
        ContactApp existing = contactAppRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contact not found with id " + id));
        contactAppRepository.delete(existing);
    }

    private ResponseDTO toResponse(ContactApp contact) {
        return ResponseDTO.builder()
                .id(contact.getId())
                .name(contact.getName())
                .mail(contact.getEmail())
                .mobNo(contact.getMobNo())
                .build();

    }

}
