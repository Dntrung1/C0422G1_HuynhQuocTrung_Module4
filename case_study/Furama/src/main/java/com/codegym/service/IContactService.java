package com.codegym.service;

import com.codegym.common.IContractTotal;
import com.codegym.model.contact.Contact;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContactService {
    List<Contact> findAll(Pageable pageable);
    Contact findById(int id);
    List<IContractTotal> contactTotal();
}
