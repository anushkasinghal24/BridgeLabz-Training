package com.payrollsuite.employeepayroll.service;

import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.entity.Payroll;
import org.springframework.http.ResponseEntity;

public interface PayrollService {
    public ResponseEntity<PayrollResponseDTO> addPayroll(long empId, Payroll payroll);
}

