package com.payrollsuite.employeepayroll.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.dto.request.DepartmentRequestDTO;
import com.payrollsuite.employeepayroll.dto.response.DepartmentResponseDTO;
import com.payrollsuite.employeepayroll.entity.Department;
import com.payrollsuite.employeepayroll.entity.Employee;
import com.payrollsuite.employeepayroll.repository.DepartmentRepository;
import com.payrollsuite.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
public class DepartmentMapper {

    @Autowired
    private final DepartmentRepository departmentRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;

    public Department fromDTO(DepartmentRequestDTO departmentRequestDTO){
        Department department = Department.builder()
                .name(departmentRequestDTO.getName())
                .description(departmentRequestDTO.getDescription())
                .build();
        if(departmentRequestDTO.getEmployees()!=null){
            for(Employee e : departmentRequestDTO.getEmployees()){
                department.getEmployees().add(e);
            }
        }
        return department;
    }

    public DepartmentResponseDTO toDTO(Department department){

        return DepartmentResponseDTO.builder()
                .name(department.getName())
                .description(department.getDescription())
                .departmentId(department.getDepartmentId())
                .build();
    }
}

