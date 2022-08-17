package com.codegym.service.impl;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalRepository;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    private IMedicalRepository iMedicalRepository;

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        iMedicalRepository.save(medicalDeclaration);
    }

    @Override
    public List<MedicalDeclaration> findAllMedical() {
        return iMedicalRepository.findAllMedical();
    }

    @Override
    public MedicalDeclaration findid(int id) {
        return iMedicalRepository.findid(id);
    }

    @Override
    public void edit(MedicalDeclaration medicalDeclaration) {
        iMedicalRepository.edit(medicalDeclaration);
    }

    @Override
    public void delete(int id) {
        iMedicalRepository.delete(id);
    }
}
