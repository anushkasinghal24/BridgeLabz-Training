package com.payrollsuite.employeepayroll.controller;

import jakarta.validation.Valid;
import lombok.Data;
import com.payrollsuite.employeepayroll.dto.request.DepartmentRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.DepartmentResponseDTO;
import com.payrollsuite.employeepayroll.entity.Department;
import com.payrollsuite.employeepayroll.mapper.DepartmentMapper;
import com.payrollsuite.employeepayroll.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "department")
@Data
public class DepartmentController {

    @Autowired
    private final DepartmentService departmentService;
    @Autowired
    private final DepartmentMapper departmentMapper;

    @GetMapping("/all")
    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @PostMapping("/admin/add")
    public ResponseEntity<DepartmentResponseDTO> addDepartment(@Valid @RequestBody DepartmentRequestDTO departmentRequestDTO){

        Department department = departmentMapper.fromDTO(departmentRequestDTO);
        return departmentService.addDepartment(department);
    }
}

