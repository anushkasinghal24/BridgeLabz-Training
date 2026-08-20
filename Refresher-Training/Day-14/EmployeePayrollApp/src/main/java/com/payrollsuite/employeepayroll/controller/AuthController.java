package com.payrollsuite.employeepayroll.controller;

import com.payrollsuite.employeepayroll.dto.request.LoginRequestDTO;
import com.payrollsuite.employeepayroll.dto.request.RegisterRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.RegisterResponseDTO;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.mapper.EmployeeMapper;
import com.payrollsuite.employeepayroll.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/auth")
@Data
@Slf4j
public class AuthController {

    @Autowired
    private final EmployeeMapper employeeMapper;
    @Autowired
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@Valid @RequestBody RegisterRequestDTO registerRequestDTO){
        log.info("Entered register endpoint");
        Employee employee = employeeMapper.fromDTO(registerRequestDTO);
        log.info("Exiting register endpoint");
        return authService.register(employee);
    }

    @GetMapping("/login")
    public ResponseEntity< String > login(@Valid @RequestBody LoginRequestDTO loginRequestDTO) {
        return authService.login(loginRequestDTO);
    }

}

