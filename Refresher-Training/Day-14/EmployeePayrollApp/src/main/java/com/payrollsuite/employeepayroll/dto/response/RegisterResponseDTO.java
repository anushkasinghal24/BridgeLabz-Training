package com.payrollsuite.employeepayroll.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.entity.Department;
import com.payrollsuite.employeepayroll.entity.Payroll;
import com.payrollsuite.employeepayroll.enums.Role;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponseDTO {
    private String username;

    private String firstName;

    private String lastName;

    private String phone;

    private double salary;

    private LocalDate joiningDate;

    private Role role;

    private Department department;

    private List<Payroll> payroll;

}

