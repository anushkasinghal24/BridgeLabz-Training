package com.contacts.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.contacts.dto.request.ContactRequestDto;
import com.contacts.dto.response.ContactResponseDto;
import com.contacts.service.ContactService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class ContactControllerTest {

    @Mock
    private ContactService contactService;

    @InjectMocks
    private ContactController controller;

    @Test
    void createReturnsCreatedStatusAndResponseBody() {
        ContactResponseDto response = ContactResponseDto.builder()
                .id(1)
                .name("Asha")
                .email("asha@example.com")
                .mobNo("9999999999")
                .build();

        when(contactService.createContact(any(ContactRequestDto.class))).thenReturn(response);

        ResponseEntity<ContactResponseDto> result = controller.create(ContactRequestDto.builder()
                .name("Asha")
                .email("asha@example.com")
                .mobNo("9999999999")
                .build());

        assertEquals(HttpStatus.CREATED, result.getStatusCode());
        assertEquals("Asha", result.getBody().getName());
        verify(contactService).createContact(any(ContactRequestDto.class));
    }
}
