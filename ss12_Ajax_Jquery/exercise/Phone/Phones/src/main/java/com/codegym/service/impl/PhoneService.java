package com.codegym.service.impl;

import com.codegym.model.Phone;
import com.codegym.repository.IPhoneRepository;
import com.codegym.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private IPhoneRepository iPhoneRepository;
    @Override
    public List<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public Phone findById(int id) {
        return iPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Phone phone) {
        iPhoneRepository.save(phone);
    }

    @Override
    public void update(Phone phone) {
        iPhoneRepository.save(phone);
    }

    @Override
    public void delete(int id) {
        iPhoneRepository.deleteById(id);
    }
}
