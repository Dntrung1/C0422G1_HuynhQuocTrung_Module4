package com.codegym.service;

import com.codegym.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);
    List<Facility> findAllFac();
    Facility findById(int id);
    void createFacility(Facility facility);
    void updateFacility(Facility facility);
    void deleteFacility(int id);
}
