package com.codegym.service.impl;

import com.codegym.model.employee.EmployeeDivision;
import com.codegym.repository.IEmployeeDivisionRepository;
import com.codegym.service.IEmployeeDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDivisionService implements IEmployeeDivisionService {
    @Autowired
    private IEmployeeDivisionRepository iEmployeeDivisionRepository;
    @Override
    public List<EmployeeDivision> findALl() {
        return iEmployeeDivisionRepository.findAll();
    }
}
