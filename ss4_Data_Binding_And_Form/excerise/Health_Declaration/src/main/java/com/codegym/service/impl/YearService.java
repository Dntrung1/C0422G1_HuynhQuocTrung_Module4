package com.codegym.service.impl;

import com.codegym.model.Year;
import com.codegym.repository.IYearRepository;
import com.codegym.service.IYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearService implements IYearService {
    @Autowired
    private IYearRepository iYearRepository;

    @Override
    public List<Year> findAllYear() {
        return iYearRepository.findAllYear();
    }
}
