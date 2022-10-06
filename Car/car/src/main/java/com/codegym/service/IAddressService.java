package com.codegym.service;

import com.codegym.model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();
}
