package com.payrollsuite.employeepayroll.service;

import lombok.Data;
import com.payrollsuite.employeepayroll.dto.response.DepartmentResponseDTO;
import com.payrollsuite.employeepayroll.entity.Department;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.mapper.DepartmentMapper;
import com.payrollsuite.employeepayroll.repository.DepartmentRepository;
import com.payrollsuite.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@RequestMapping(path = "department")
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private final DepartmentRepository departmentRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final DepartmentMapper departmentMapper;

    @Override
    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment(){
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentResponseDTO> departmentResponseDTOS = new ArrayList<>();

        for(Department key: departments){
            departmentResponseDTOS.add(
                    departmentMapper.toDTO(key)
            );
        }

        return ResponseEntity.status(HttpStatus.OK).body(departmentResponseDTOS);
    }

    @Override
    @Transactional
    public ResponseEntity<DepartmentResponseDTO> addDepartment(Department department){
        Department department1 = null;
        if(department.getEmployees()==null || department.getEmployees().isEmpty()){
            department1 = departmentRepository.save(department);
            return ResponseEntity.status(HttpStatus.CREATED).body(departmentMapper.toDTO(department1));
        }

        for(Employee emp : department.getEmployees()){
            emp.setDepartment(department);
            employeeRepository.save(emp);
        }
        department1 = departmentRepository.save(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentMapper.toDTO(department1));

    }

}

