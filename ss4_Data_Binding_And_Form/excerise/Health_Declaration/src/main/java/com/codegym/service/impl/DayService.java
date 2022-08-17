package com.codegym.service.impl;

import com.codegym.model.Day;
import com.codegym.repository.IDayRepository;
import com.codegym.service.IDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DayService implements IDayService {
    @Autowired private IDayRepository iDayRepository;
    @Override
    public List<Day> findAllDay() {
        return iDayRepository.findAllDay();
    }
}
