package com.payrollsuite.employeepayroll.service;

import com.payrollsuite.employeepayroll.dto.request.LoginRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.RegisterResponseDTO;
import com.payrollsuite.employeepayroll.entity.Employee;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    public ResponseEntity<RegisterResponseDTO> register(Employee employee);
    public ResponseEntity<String> login(LoginRequestDTO loginRequestDTO);
}

