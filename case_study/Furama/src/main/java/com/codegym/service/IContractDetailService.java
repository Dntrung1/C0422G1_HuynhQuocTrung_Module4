package com.codegym.service;

import com.codegym.model.contact.ContactDetail;

import java.util.List;

public interface IContractDetailService {
    void createContractDetail(ContactDetail contactDetail);
    List<ContactDetail> findByIdContract(int id);
}
