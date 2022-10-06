package com.codegym.repository;

import com.codegym.model.employee.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePositionRepository extends JpaRepository<EmployeePosition, Integer> {
}
