package com.codegym.repository.impl;

import com.codegym.model.Nationality;
import com.codegym.repository.INationalityRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class NationalityRepository implements INationalityRepository {
    private static List<Nationality> nationalityList = new ArrayList<>();
    static {
        nationalityList.add(new Nationality("Việt Nam"));
        nationalityList.add(new Nationality("Trung Quốc"));
        nationalityList.add(new Nationality("Thái lan"));
    }
    @Override
    public List<Nationality> findAllNation() {
        return nationalityList;
    }
}
