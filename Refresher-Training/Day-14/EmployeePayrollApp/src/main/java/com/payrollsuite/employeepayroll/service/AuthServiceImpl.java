package com.payrollsuite.employeepayroll.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import com.payrollsuite.employeepayroll.dto.request.LoginRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.RegisterResponseDTO;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.exception.InvalidRegisterRequestException;
import com.payrollsuite.employeepayroll.mapper.EmployeeMapper;
import com.payrollsuite.employeepayroll.repository.DepartmentRepository;
import com.payrollsuite.employeepayroll.repository.EmployeeRepository;
import com.payrollsuite.employeepayroll.security.CustomUserDetailsService;
import com.payrollsuite.employeepayroll.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Data
@Slf4j
public class AuthServiceImpl implements AuthService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Override
    @Transactional
    public ResponseEntity<RegisterResponseDTO> register(Employee employee){
        log.info("Entered register service");
        if(employee.getRole().name().equals("ADMIN")||employee.getRole().name().equals("MANAGER")){
            throw new InvalidRegisterRequestException("You cannot register directly as ADMIN or MANAGER");
        }
        employee.getDepartment().getEmployees().add(employee);
        String codedPassword = passwordEncoder.encode(employee.getPassword());
        employee.setPassword(codedPassword);
        Employee employee1 = employeeRepository.save(employee);
        log.info("Exiting register service");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeMapper.toDTO(employee1));
    }

    @Override
    @Transactional
    public ResponseEntity<String> login(LoginRequestDTO loginRequestDTO){
        String username = loginRequestDTO.getUsername();
        String password = loginRequestDTO.getPassword();

        Authentication authentication = new UsernamePasswordAuthenticationToken(username,password);

        Authentication authentication1 = authenticationManager.authenticate(authentication);

        SecurityContextHolder.getContext().setAuthentication(authentication1);

        return ResponseEntity.status(HttpStatus.OK).body(jwtUtil.generateJwtToken(authentication1));

    }
}

