package com.codegym.service.impl;

import com.codegym.model.facility.Facility;
import com.codegym.repository.IFacilityRepository;
import com.codegym.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired private IFacilityRepository iFacilityRepository;
    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return iFacilityRepository.findAll(pageable);
    }

    @Override
    public List<Facility> findAllFac() {
        return iFacilityRepository.findAll();
    }

    @Override
    public Facility findById(int id) {
        return iFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public void createFacility(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void updateFacility(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void deleteFacility(int id) {
        iFacilityRepository.deleteById(id);
    }
}
