package com.codegym.service.impl;

import com.codegym.model.contact.AttachFacility;
import com.codegym.model.contact.Contact;
import com.codegym.model.contact.ContactDetail;
import com.codegym.repository.IContactDetailRepository;
import com.codegym.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContactDetailRepository iContactDetailRepository;
    @Autowired
    private ContactService contactService;
    @Autowired
    private AttachFacilityService attachFacilityService;

    @Override
    public void createContractDetail(int id, String[] arr) {
        String[] arrContractDetail = arr;
        List<String> contractDetailList = new ArrayList<>();
        for (int i = 0; i < arrContractDetail.length; i++) {
            if (!arrContractDetail[i].equals("")){
                contractDetailList.add(arrContractDetail[i]);
            }
        }
        for (int i = 0; i < contractDetailList.size(); i++) {
            AttachFacility attachFacility = attachFacilityService.findById(Integer.parseInt(contractDetailList.get(i)));
            Contact contact = contactService.findById(id);
            ContactDetail contactDetails = new ContactDetail(Integer.parseInt(contractDetailList.get(i+1)),
                    attachFacility,contact);
            iContactDetailRepository.save(contactDetails);
            i++;
        }
    }

    @Override
    public List<ContactDetail> findByIdContract(int id) {
        return iContactDetailRepository.findAllByContact_IdContact(id);
    }

    @Override
    public List<ContactDetail> findAll() {
        return iContactDetailRepository.findAll();
    }
}
