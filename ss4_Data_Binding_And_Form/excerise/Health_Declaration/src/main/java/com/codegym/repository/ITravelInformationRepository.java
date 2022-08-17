package com.codegym.repository;

import com.codegym.model.TravelInformation;

import java.util.List;

public interface ITravelInformationRepository {
    List<TravelInformation> findAllTravel();
}
