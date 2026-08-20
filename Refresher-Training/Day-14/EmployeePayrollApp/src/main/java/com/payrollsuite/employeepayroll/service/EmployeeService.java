package com.payrollsuite.employeepayroll.service;

import com.payrollsuite.employeepayroll.dto.request.UpdateRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.dto.response.RegisterResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    public ResponseEntity<RegisterResponseDTO> getEmployeeById(Long id);
    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees();
    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(String username);
    public ResponseEntity<List<RegisterResponseDTO>> getEmployeesByDepartmentName(String departmentName);
    public ResponseEntity<RegisterResponseDTO> updateUserDetails(Long employeeId, UpdateRequestDTO updateRequestDTO);
    public ResponseEntity<List<PayrollResponseDTO>> getAllPayrolls(Long id);
    public void promoteToManager(long id);
}

