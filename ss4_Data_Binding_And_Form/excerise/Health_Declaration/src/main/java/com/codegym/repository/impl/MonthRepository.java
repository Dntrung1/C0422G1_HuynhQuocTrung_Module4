package com.codegym.repository.impl;

import com.codegym.model.Month;
import com.codegym.repository.IMonthRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MonthRepository implements IMonthRepository {
    private static List<Month> monthList = new ArrayList<>();
    static {
        for (int i = 1; i < 13 ; i++) {
            monthList.add(new Month(i));
        }
    }
    @Override
    public List<Month> findAllMonth() {
        return monthList;
    }
}
