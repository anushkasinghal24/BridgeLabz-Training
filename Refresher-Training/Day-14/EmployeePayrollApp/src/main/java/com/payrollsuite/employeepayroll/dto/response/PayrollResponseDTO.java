package com.payrollsuite.employeepayroll.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.entity.Employee;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayrollResponseDTO {

    private double basicSalary;

    private double allowance;

    private double deduction;

    private double tax;

    private double netSalary;

    private int payrollMonth;

    private int payrollYear;
}

