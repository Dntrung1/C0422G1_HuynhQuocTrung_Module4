package com.codegym.service.impl;

import com.codegym.model.contact.AttachFacility;
import com.codegym.model.contact.ContactDetail;
import com.codegym.repository.IAttachFacilityRepository;
import com.codegym.service.IAttachFacilityService;
import com.codegym.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AttachFacilityService implements IAttachFacilityService {
    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Autowired
    private IContractDetailService iContractDetailService;
    @Override
    public List<AttachFacility> findAll() {
        return iAttachFacilityRepository.findAll();
    }

    @Override
    public AttachFacility findById(int id) {
        return iAttachFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public List<AttachFacility> findAllBy(int id) {
        List<AttachFacility> attachFacilityList = new ArrayList<>();
        List<ContactDetail> contactDetailList = iContractDetailService.findByIdContract(id);
        for (int i = 0; i <contactDetailList.size() ; i++) {
            attachFacilityList.add(contactDetailList.get(i).getAttachFacility());
        }
        return attachFacilityList;
    }
}
