package com.payrollsuite.employeepayroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payrollsuite.employeepayroll.entity.Department ;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

