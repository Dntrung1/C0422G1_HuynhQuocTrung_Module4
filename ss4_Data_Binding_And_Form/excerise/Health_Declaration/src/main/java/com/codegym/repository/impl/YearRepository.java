package com.codegym.repository.impl;

import com.codegym.model.Year;
import com.codegym.repository.IYearRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class YearRepository implements IYearRepository {
    private static List<Year> yearList = new ArrayList<>();
    static {
        for (int i = 1900; i < 2050 ; i++) {
            yearList.add(new Year(i + ""));
        }
    }
    @Override
    public List<Year> findAllYear() {
        return yearList;
    }
}
