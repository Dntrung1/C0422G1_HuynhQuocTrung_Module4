package com.codegym.service.impl;

import com.codegym.model.contact.ContactDetail;
import com.codegym.repository.IContactDetailRepository;
import com.codegym.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContactDetailRepository iContactDetailRepository;

    @Override
    public void createContractDetail(ContactDetail contactDetail) {
        iContactDetailRepository.save(contactDetail);
    }

    @Override
    public List<ContactDetail> findByIdContract(int id) {
        return iContactDetailRepository.findAllByContact_IdContact(id);
    }
}
