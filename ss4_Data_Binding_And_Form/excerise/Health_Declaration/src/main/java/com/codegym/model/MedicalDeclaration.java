package com.codegym.model;

public class MedicalDeclaration {
    private int id;
    private String name;
    private String yearOfBirth;
    private boolean gender;
    private String nationality;
    private String identityCard;
    private String travelInformation;
    private String vehicleNumber;
    private int seats;
    private int departureDay;
    private int departureMonth;
    private int departureYear;
    private int dayEnds;
    private int monthEnds;
    private int yearEnds;
    private String note;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(int id, String name, String yearOfBirth, boolean gender, String nationality, String identityCard,
                              String travelInformation, String vehicleNumber, int seats, int departureDay, int departureMonth,
                              int departureYear, int dayEnds, int monthEnds, int yearEnds, String note) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.travelInformation = travelInformation;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.dayEnds = dayEnds;
        this.monthEnds = monthEnds;
        this.yearEnds = yearEnds;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(int departureDay) {
        this.departureDay = departureDay;
    }

    public int getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(int departureMonth) {
        this.departureMonth = departureMonth;
    }

    public int getDepartureYear() {
        return departureYear;
    }

    public void setDepartureYear(int departureYear) {
        this.departureYear = departureYear;
    }

    public int getDayEnds() {
        return dayEnds;
    }

    public void setDayEnds(int dayEnds) {
        this.dayEnds = dayEnds;
    }

    public int getMonthEnds() {
        return monthEnds;
    }

    public void setMonthEnds(int monthEnds) {
        this.monthEnds = monthEnds;
    }

    public int getYearEnds() {
        return yearEnds;
    }

    public void setYearEnds(int yearEnds) {
        this.yearEnds = yearEnds;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
