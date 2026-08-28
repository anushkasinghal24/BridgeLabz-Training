package org.example.fundoo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponseDTO {

    private Long userId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String username;

    private String password;
}
