package com.payrollsuite.employeepayroll.dto.request;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.entity.Employee;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DepartmentRequestDTO {

    private String name;

    private String description;

    private List<Employee> employees;

}

