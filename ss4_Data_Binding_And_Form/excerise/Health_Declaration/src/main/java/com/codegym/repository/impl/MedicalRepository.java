package com.codegym.repository.impl;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {
    private List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        int id = (int) (Math.random() * 1000);
        medicalDeclaration.setId(id);
        medicalDeclarationList.add(medicalDeclaration);
    }

    @Override
    public List<MedicalDeclaration> findAllMedical() {
        return medicalDeclarationList;
    }

    @Override
    public MedicalDeclaration findid(int id) {
        MedicalDeclaration medicalDeclaration = new MedicalDeclaration();
        for (int i = 0; i < medicalDeclarationList.size(); i++) {
            if (id == medicalDeclarationList.get(i).getId()) {
                medicalDeclaration = medicalDeclarationList.get(i);
            }
        }
        return medicalDeclaration;
    }

    @Override
    public void edit(MedicalDeclaration medicalDeclaration) {
        for (int i = 0; i < medicalDeclarationList.size(); i++) {
            if (medicalDeclaration.getId() == medicalDeclarationList.get(i).getId()) {
                medicalDeclarationList.get(i).setName(medicalDeclaration.getName());
                medicalDeclarationList.get(i).setYearOfBirth(medicalDeclaration.getYearOfBirth());
                medicalDeclarationList.get(i).setGender(medicalDeclaration.isGender());
                medicalDeclarationList.get(i).setNationality(medicalDeclaration.getNationality());
                medicalDeclarationList.get(i).setIdentityCard(medicalDeclaration.getIdentityCard());
                medicalDeclarationList.get(i).setTravelInformation(medicalDeclaration.getTravelInformation());
                medicalDeclarationList.get(i).setVehicleNumber(medicalDeclaration.getVehicleNumber());
                medicalDeclarationList.get(i).setSeats(medicalDeclaration.getSeats());
                medicalDeclarationList.get(i).setDepartureDay(medicalDeclaration.getDepartureDay());
                medicalDeclarationList.get(i).setDepartureMonth(medicalDeclaration.getDepartureMonth());
                medicalDeclarationList.get(i).setDayEnds(medicalDeclaration.getDayEnds());
                medicalDeclarationList.get(i).setMonthEnds(medicalDeclaration.getMonthEnds());
                medicalDeclarationList.get(i).setYearEnds(medicalDeclaration.getYearEnds());
                medicalDeclarationList.get(i).setNote(medicalDeclaration.getNote());
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < medicalDeclarationList.size(); i++) {
            if (id == medicalDeclarationList.get(i).getId()) {
                medicalDeclarationList.remove(medicalDeclarationList.get(i));
            }
        }
    }
}
