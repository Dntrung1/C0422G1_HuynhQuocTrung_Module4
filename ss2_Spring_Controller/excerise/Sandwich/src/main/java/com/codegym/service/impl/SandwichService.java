package com.codegym.service.impl;

import com.codegym.model.Sandwich;
import com.codegym.repository.ISandwichRepository;
import com.codegym.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService implements ISandwichService {

    @Autowired
    private ISandwichRepository iSandwichRepository;

    @Override
    public List<Sandwich> findAll() {
        return iSandwichRepository.findAll();
    }
}
