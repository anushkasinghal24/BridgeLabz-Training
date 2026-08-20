package com.payrollsuite.employeepayroll.service;

import com.payrollsuite.employeepayroll.dto.response.DepartmentResponseDTO;
import com.payrollsuite.employeepayroll.entity.Department;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentService {
    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment();
    public ResponseEntity<DepartmentResponseDTO> addDepartment(Department department);
}

