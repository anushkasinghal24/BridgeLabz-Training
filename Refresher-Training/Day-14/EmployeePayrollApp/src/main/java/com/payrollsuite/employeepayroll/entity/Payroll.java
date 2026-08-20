package com.payrollsuite.employeepayroll.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;

    private double basicSalary;

    private double allowance;

    private double deduction;

    private double tax;

    private double netSalary;

    private int payrollMonth;

    private int payrollYear;

//    public void setEmployee(Employee employee){
//        this.employee = employee;
//        this.employee.getPayrolls().add(this);
//    }
}

