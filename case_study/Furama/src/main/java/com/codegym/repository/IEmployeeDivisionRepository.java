package com.codegym.repository;

import com.codegym.model.employee.EmployeeDivision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDivisionRepository extends JpaRepository<EmployeeDivision, Integer> {
}
