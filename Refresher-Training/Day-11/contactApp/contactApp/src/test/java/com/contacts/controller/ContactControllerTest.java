package com.contacts.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import com.contacts.dto.response.ContactResponseDto;
import com.contacts.service.ContactService;
import org.junit.jupiter.api.Test;

class ContactControllerTest {

    @Test
    void getAllReturnsContactsFromService() {
        ContactService service = mock(ContactService.class);
        when(service.getAllContacts()).thenReturn(List.of(
                ContactResponseDto.builder()
                        .id(1)
                        .name("Asha")
                        .email("asha@example.com")
                        .mobNo("9999999999")
                        .build()
        ));

        ContactController controller = new ContactController(service);

        assertEquals(1, controller.getAll().getBody().size());
    }
}
