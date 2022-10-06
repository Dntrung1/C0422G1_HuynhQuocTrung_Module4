package com.codegym.service.impl;

import com.codegym.model.employee.EmployeePosition;
import com.codegym.repository.IEmployeePositionRepository;
import com.codegym.service.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeePositionService implements IEmployeePositionService {
    @Autowired
    private IEmployeePositionRepository iEmployeePositionRepository;
    @Override
    public List<EmployeePosition> findAll() {
        return iEmployeePositionRepository.findAll();
    }
}
