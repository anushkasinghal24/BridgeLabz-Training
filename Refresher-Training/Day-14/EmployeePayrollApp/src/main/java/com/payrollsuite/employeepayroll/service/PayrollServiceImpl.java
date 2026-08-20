package com.payrollsuite.employeepayroll.service;

import lombok.Data;
import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.entity.Payroll;
import com.payrollsuite.employeepayroll.mapper.PayrollMapper;
import com.payrollsuite.employeepayroll.repository.EmployeeRepository;
import com.payrollsuite.employeepayroll.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Data
public class PayrollServiceImpl implements PayrollService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final PayrollRepository payrollRepository;
    @Autowired
    private final PayrollMapper payrollMapper;


    @Override
    @Transactional
    public ResponseEntity<PayrollResponseDTO> addPayroll(long empId, Payroll payroll) {

        Employee employee = employeeRepository.findById(empId)
                .orElseThrow();

        System.out.println("Current salary = " + employee.getSalary());
        System.out.println("Incoming salary = " + payroll.getBasicSalary());

        employee.setSalary(payroll.getBasicSalary());

        employeeRepository.save(employee);

        payroll.setEmployee(employee);
        employee.getPayrolls().add(payroll);

        Payroll payroll1 = payrollRepository.save(payroll);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(payrollMapper.toDTO(payroll1));
    }

}

