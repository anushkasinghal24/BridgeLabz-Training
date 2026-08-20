package com.payrollsuite.employeepayroll.dto.request;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.entity.Department;
import com.payrollsuite.employeepayroll.enums.Role;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequestDTO {

    @Email(message = "username should be of type email")
    @NotBlank(message = "email cannot be black")
    private String userName;

    @NotBlank
    @Size(min = 8,max = 15, message = "password should be of length between 8 and 15")
    private String password;

    @NotNull(message = "first name cannot be null")
    private String firstName;

    private String lastName;

    @Size(min = 7,max = 10, message = "phone number should be of valid length")
    private String phone;

    private double salary;

    private LocalDate joiningDate;

    private Role role;

    private Long departmentId;

}

