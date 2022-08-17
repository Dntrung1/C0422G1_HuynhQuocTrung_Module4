package com.codegym.service.impl;

import com.codegym.model.Nationality;
import com.codegym.repository.INationalityRepository;
import com.codegym.service.INationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NationalityService implements INationalityService {
    @Autowired
    private INationalityRepository iNationalityRepository;
    @Override
    public List<Nationality> findAllNation() {
        return iNationalityRepository.findAllNation();
    }
}
