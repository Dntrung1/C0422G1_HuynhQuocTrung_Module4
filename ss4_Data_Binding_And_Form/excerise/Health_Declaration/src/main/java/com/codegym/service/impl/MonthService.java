package com.codegym.service.impl;

import com.codegym.model.Month;
import com.codegym.repository.IMonthRepository;
import com.codegym.service.IMonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonthService implements IMonthService {
    @Autowired private IMonthRepository iMonthRepository;
    @Override
    public List<Month> findAllMonth() {
        return iMonthRepository.findAllMonth();
    }
}
