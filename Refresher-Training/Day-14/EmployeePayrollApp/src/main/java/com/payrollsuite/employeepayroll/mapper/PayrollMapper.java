package com.payrollsuite.employeepayroll.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.payrollsuite.employeepayroll.dto.request.PayrollRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.entity.Payroll;
import com.payrollsuite.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@Builder
public class PayrollMapper {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public Payroll fromDTO(PayrollRequestDTO payrollRequestDTO){
        Payroll p = Payroll.builder()
                .allowance(payrollRequestDTO.getAllowance())
                .basicSalary(payrollRequestDTO.getBasicSalary())
                .deduction(payrollRequestDTO.getDeduction())
                .netSalary(payrollRequestDTO.getNetSalary())
                .payrollMonth(payrollRequestDTO.getPayrollMonth())
                .payrollYear(payrollRequestDTO.getPayrollYear())
                .tax(payrollRequestDTO.getTax())
                .build();

        return p;
    }

    public PayrollResponseDTO toDTO(Payroll payroll){
        PayrollResponseDTO payrollResponseDTO = PayrollResponseDTO
                .builder()
                .payrollMonth(payroll.getPayrollMonth())
                .payrollYear(payroll.getPayrollYear())
                .allowance(payroll.getAllowance())
                .basicSalary(payroll.getBasicSalary())
                .deduction(payroll.getDeduction())
                .netSalary(payroll.getNetSalary())
                .tax(payroll.getTax())
                .build();

        return payrollResponseDTO;
    }

}

