package com.codegym.service.impl;

import com.codegym.model.contact.AttachFacility;
import com.codegym.model.contact.Contact;
import com.codegym.model.contact.ContactDetail;
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
    @Autowired
    private ContractDetailService contractDetailService;
    @Autowired
    private AttachFacilityService attachFacilityService;
    @Autowired
    private FacilityService facilityService;

    @Override
    public List<Contact> findAll(Pageable pageable) {
        List<Contact> contactList = iContractRepository.findAll();
        List<ContactDetail> contactDetailList = contractDetailService.findAll();
        List<AttachFacility> attachFacilityList = attachFacilityService.findAll();
        for (Contact c:contactList){
            Double total = c.getFacility().getCost();
            for (ContactDetail cdt:contactDetailList){
                if (cdt.getContact().getIdContact() == c.getIdContact()){
                    for (AttachFacility a:attachFacilityList){
                        if (a.getId() == cdt.getAttachFacility().getId()){
                            total += a.getCost()*cdt.getQuantity();
                        }
                    }
                }
            }
            c.setTotal(total);
        }
        return contactList;
    }

    @Override
    public Contact findById(int id) {
        return iContractRepository.findById(id).orElse(null);
    }

}

