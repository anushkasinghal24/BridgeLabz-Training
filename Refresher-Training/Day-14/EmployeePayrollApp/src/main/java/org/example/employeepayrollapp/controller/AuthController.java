package org.example.employeepayrollapp.controller;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.employeepayrollapp.dto.request.LoginRequestDTO;
import org.example.employeepayrollapp.dto.request.RegisterRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.service.AuthService;
import org.example.employeepayrollapp.service.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        log.info("controller ke register method m enter kar gya");
        Employee employee = employeeMapper.fromDTO(registerRequestDTO);
        log.info("controller ke register method se exit lene wala h");
        return authService.register(employee);
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequestDTO loginRequestDTO){
        return authService.login(loginRequestDTO);
    }

}
