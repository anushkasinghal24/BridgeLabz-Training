package com.contacts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;
import com.contacts.entity.Contact;
import com.contacts.mapper.ContactMapper;
import com.contacts.repository.ContactRepository;
import com.contacts.service.impl.ContactServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContactServiceImplTest {

    @Mock
    private ContactRepository repository;

    private ContactServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new ContactServiceImpl(repository, new ContactMapper());
    }

    @Test
    void createContactMapsRequestAndSavesEntity() {
        ContactRequestDto request = ContactRequestDto.builder()
                .name("Asha")
                .email("asha@example.com")
                .mobNo("9999999999")
                .build();

        when(repository.save(any(Contact.class))).thenAnswer(invocation -> invocation.getArgument(0));

        ContactResponseDto response = service.createContact(request);

        assertEquals("Asha", response.getName());
        assertEquals("asha@example.com", response.getEmail());
        assertEquals("9999999999", response.getMobNo());
        verify(repository).save(any(Contact.class));
    }

    @Test
    void getContactByIdReturnsMappedContactWhenFound() {
        Contact contact = Contact.builder()
                .id(1)
                .name("Asha")
                .email("asha@example.com")
                .mobNo("9999999999")
                .build();

        when(repository.findById(1)).thenReturn(Optional.of(contact));

        ContactResponseDto response = service.getContactById(1);

        assertNotNull(response);
        assertEquals(1, response.getId());
        assertEquals("Asha", response.getName());
        verify(repository).findById(1);
    }
}
