package com.codegym.repository.impl;

import com.codegym.model.TravelInformation;
import com.codegym.repository.ITravelInformationRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TravelInformationRepository implements ITravelInformationRepository {
    private static List<TravelInformation> travelInformationList = new ArrayList<>();
    static {
        travelInformationList.add(new TravelInformation("Tàu Bay"));
        travelInformationList.add(new TravelInformation("Tàu Thuyền"));
        travelInformationList.add(new TravelInformation("Tàu Oto"));
        travelInformationList.add(new TravelInformation("Khác"));
    }
    @Override
    public List<TravelInformation> findAllTravel() {
        return travelInformationList;
    }
}
