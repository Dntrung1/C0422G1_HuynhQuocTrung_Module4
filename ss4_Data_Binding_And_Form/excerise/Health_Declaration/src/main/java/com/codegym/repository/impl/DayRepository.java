package com.codegym.repository.impl;

import com.codegym.model.Day;
import com.codegym.repository.IDayRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DayRepository implements IDayRepository {
    private static List<Day> dayList = new ArrayList<>();

    static {
        for (int i = 1; i < 31; i++) {
            dayList.add(new Day(i));
        }
    }

    @Override
    public List<Day> findAllDay() {
        return dayList;
    }
}
