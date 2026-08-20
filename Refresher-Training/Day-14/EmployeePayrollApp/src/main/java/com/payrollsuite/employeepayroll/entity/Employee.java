package com.payrollsuite.employeepayroll.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.payrollsuite.employeepayroll.enums.Role;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(nullable = false,unique = true)
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String phone;

    private double salary;

    private LocalDate joiningDate;

    private Role role = Role.EMPLOYEE;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Payroll> payrolls = new ArrayList<>();

}

