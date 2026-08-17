package com.contacts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.entity.Contact;
import com.contacts.mapper.ContactMapper;
import com.contacts.repository.ContactRepository;
import com.contacts.service.impl.ContactServiceImpl;
import org.junit.jupiter.api.Test;

class ContactServiceImplTest {

    @Test
    void createContactMapsAndSavesEntity() {
        ContactRepository repository = mock(ContactRepository.class);
        ContactMapper mapper = new ContactMapper();
        ContactServiceImpl service = new ContactServiceImpl(repository, mapper);

        ContactRequestDto request = ContactRequestDto.builder()
                .name("Asha")
                .email("asha@example.com")
                .mobNo("9999999999")
                .build();

        when(repository.save(org.mockito.ArgumentMatchers.any(Contact.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        assertEquals("Asha", service.createContact(request).getName());
    }
}
