package com.payrollsuite.employeepayroll.repository;

import com.payrollsuite.employeepayroll.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Long> {

    List<Payroll> getAllByEmployee_EmployeeId(Long id);

}

