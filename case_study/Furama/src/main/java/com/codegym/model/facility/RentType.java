package com.codegym.model.facility;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "rentType")
    private List<Facility> facilityList;

    public RentType(int id, String name, List<Facility> facilityList) {
        this.id = id;
        this.name = name;
        this.facilityList = facilityList;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public RentType() {
    }

    public RentType(int id, String name) {
        this.id = id;
        this.name = name;
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
}
