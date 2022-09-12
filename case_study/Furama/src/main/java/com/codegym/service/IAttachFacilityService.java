package com.codegym.service;

import com.codegym.model.contact.AttachFacility;

import java.util.List;

public interface IAttachFacilityService {
    List<AttachFacility> findAll();
    AttachFacility findById(int id);
    List<AttachFacility> findAllBy(int id);
}
