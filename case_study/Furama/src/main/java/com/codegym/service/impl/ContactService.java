package com.codegym.service.impl;

import com.codegym.common.IContractTotal;
import com.codegym.model.contact.Contact;
import com.codegym.repository.IContractRepository;
import com.codegym.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService implements IContactService {
    @Autowired
    private IContractRepository iContractRepository;
    @Override
    public List<Contact> findAll(Pageable pageable) {
        return iContractRepository.findAll();
    }

    @Override
    public Contact findById(int id) {
        return iContractRepository.findById(id).orElse(null);
    }

    @Override
    public List<IContractTotal> contactTotal() {
        return iContractRepository.contactTotal();
    }
}
