package com.codegym.service;

import com.codegym.model.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> findAll();
    Phone findById(int id);
    void save(Phone phone);
    void update(Phone phone);
    void delete(int id);
}
