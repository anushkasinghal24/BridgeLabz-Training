package com.payrollsuite.employeepayroll.controller;

import lombok.Data;
import com.payrollsuite.employeepayroll.dto.request.UpdateRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.PayrollResponseDTO;
import com.payrollsuite.employeepayroll.dto.response.RegisterResponseDTO;
import com.payrollsuite.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Data
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    @GetMapping("/id/{id}")
    public ResponseEntity<RegisterResponseDTO> getEmployeeById(@PathVariable(name = "id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/manager")
    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(@PathVariable(name = "username") String username){
        return employeeService.getEmployeeByUsername(username);
    }

    @GetMapping("/manager/department/{department}")
    public ResponseEntity<List<RegisterResponseDTO>> getEmployeesByDepartment(
            @PathVariable(name = "department") String department
    ){
        return employeeService.getEmployeesByDepartmentName(department);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<RegisterResponseDTO> updateUserDetails(
            @PathVariable Long id,
            @RequestBody UpdateRequestDTO updateRequestDTO
            ){
        return employeeService.updateUserDetails(id,updateRequestDTO);
    }

    @GetMapping("/payrolls/{id}")
    public ResponseEntity<List<PayrollResponseDTO>> getAllPayrollById(
            @PathVariable(name="id") Long id
    ){
        return employeeService.getAllPayrolls(id);
    }

    @PutMapping("/admin/promote/{id}")
    public ResponseEntity<String> promoteAsManager(@PathVariable long id){
        employeeService.promoteToManager(id);
        return ResponseEntity.status(HttpStatus.OK).body("User Successfully promoted to manager");
    }

}

