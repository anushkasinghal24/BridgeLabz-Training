package com.payrollsuite.employeepayroll.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PayrollRequestDTO {

    private double basicSalary;

    private double allowance;

    private double deduction;

    private double tax;

    private double netSalary;

    private int payrollMonth;

    private int payrollYear;

    private long employeeId;

}

