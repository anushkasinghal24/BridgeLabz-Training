package com.payrollsuite.employeepayroll.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LoginRequestDTO {

    @Email(message = "username should be of type email")
    @NotBlank(message = "email cannot be black")
    private String username;
    @NotBlank
    private String password;
}

