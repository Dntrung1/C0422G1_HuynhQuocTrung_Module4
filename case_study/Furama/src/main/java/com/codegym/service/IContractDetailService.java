package com.codegym.service;

import com.codegym.model.contact.ContactDetail;

import java.util.List;

public interface IContractDetailService {
    void createContractDetail(int id, String[] arr);
    List<ContactDetail> findByIdContract(int id);
    List<ContactDetail> findAll();
}
