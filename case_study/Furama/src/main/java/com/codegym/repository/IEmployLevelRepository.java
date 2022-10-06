package com.codegym.repository;

import com.codegym.model.employee.EmployLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployLevelRepository extends JpaRepository<EmployLevel, Integer> {
}
