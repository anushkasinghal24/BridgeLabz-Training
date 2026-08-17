package com.contacts.mapper;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;
import com.contacts.entity.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact toEntity(ContactRequestDto request) {
        return Contact.builder()
                .name(request.getName())
                .email(request.getEmail())
                .mobNo(request.getMobNo())
                .build();
    }

    public ContactResponseDto toResponse(Contact contact) {
        return ContactResponseDto.builder()
                .id(contact.getId())
                .name(contact.getName())
                .email(contact.getEmail())
                .mobNo(contact.getMobNo())
                .build();
    }
}
