package com.codegym.service.impl;

import com.codegym.model.TravelInformation;
import com.codegym.repository.ITravelInformationRepository;
import com.codegym.service.ITravelInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TravelInformationService implements ITravelInformationService {
    @Autowired private ITravelInformationRepository iTravelInformationRepository;
    @Override
    public List<TravelInformation> findAllTravel() {
        return iTravelInformationRepository.findAllTravel();
    }
}
