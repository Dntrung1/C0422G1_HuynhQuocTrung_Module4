package com.codegym.service.impl;

import com.codegym.model.employee.EmployLevel;
import com.codegym.repository.IEmployLevelRepository;
import com.codegym.service.IEmployeeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeLevelService implements IEmployeeLevelService {
    @Autowired
    private IEmployLevelRepository iEmployLevelRepository;
    @Override
    public List<EmployLevel> findAll() {
        return iEmployLevelRepository.findAll();
    }
}
