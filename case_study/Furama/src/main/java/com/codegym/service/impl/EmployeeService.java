package com.codegym.service.impl;

import com.codegym.model.employee.Employee;
import com.codegym.repository.IEmployeeRepository;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAllByEmployeeStatusFalse(pageable);
    }

    @Override
    public Employee findById(int id) {
        return iEmployeeRepository.findById(id).orElse(null);
    }

    @Override
    public void createEmployee(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee =  findById(id);
        employee.setEmployeeStatus(true);
        updateEmployee(employee);
    }
}
