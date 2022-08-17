package com.codegym.model;

public class TravelInformation {
    private String travelInformation;

    public TravelInformation() {
    }

    public TravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    @Override
    public String toString() {
        return travelInformation;
    }
}
