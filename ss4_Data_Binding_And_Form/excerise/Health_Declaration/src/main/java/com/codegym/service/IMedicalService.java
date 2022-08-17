package com.codegym.service;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalService {
    void save(MedicalDeclaration medicalDeclaration);

    List<MedicalDeclaration> findAllMedical();

    MedicalDeclaration findid(int id);

    void edit(MedicalDeclaration medicalDeclaration);

    void delete(int id);
}
