package com.codegym.service;

import com.codegym.model.employee.EmployeePosition;

import java.util.List;

public interface IEmployeePositionService {
    List<EmployeePosition> findAll();
}
