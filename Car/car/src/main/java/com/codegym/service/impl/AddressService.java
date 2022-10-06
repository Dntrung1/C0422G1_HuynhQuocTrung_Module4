package com.codegym.service.impl;

import com.codegym.model.Address;
import com.codegym.repository.IAddressRepository;
import com.codegym.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository iAddressRepository;
    @Override
    public List<Address> findAll() {
        return iAddressRepository.findAllAddress();
    }
}
