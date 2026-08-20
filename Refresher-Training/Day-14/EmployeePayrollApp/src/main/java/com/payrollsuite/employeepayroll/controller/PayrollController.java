package com.payrollsuite.employeepayroll.controller;

import jakarta.validation.Valid;
import lombok.Data;
import com.payrollsuite.employeepayroll.dto.request.PayrollRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.entity.Payroll;
import com.payrollsuite.employeepayroll.mapper.PayrollMapper;
import com.payrollsuite.employeepayroll.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "payroll")
@Data
public class PayrollController {

    @Autowired
    private final PayrollService payrollService;
    @Autowired
    private final PayrollMapper payrollMapper;

    @PostMapping("/manager/add")
    public ResponseEntity<PayrollResponseDTO> addPayroll(@Valid @RequestBody PayrollRequestDTO payrollRequestDTO){
        Payroll payroll = payrollMapper.fromDTO(payrollRequestDTO);
        return payrollService.addPayroll(payrollRequestDTO.getEmployeeId(),payroll);
    }
}

