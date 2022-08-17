package com.codegym.service;

import com.codegym.model.TravelInformation;

import java.util.List;

public interface ITravelInformationService {
    List<TravelInformation> findAllTravel();
}
