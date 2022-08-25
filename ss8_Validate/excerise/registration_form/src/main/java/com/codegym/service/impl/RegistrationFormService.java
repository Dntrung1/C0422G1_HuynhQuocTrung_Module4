package com.codegym.service.impl;

import com.codegym.model.RegistrationForm;
import com.codegym.repository.IRegistrationFormRepository;
import com.codegym.service.IRegistrationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormService implements IRegistrationFormService {
    @Autowired
    private IRegistrationFormRepository iRegistrationFormRepository;
    @Override
    public Page<RegistrationForm> findAll(Pageable pageable) {
        return iRegistrationFormRepository.findAll(pageable);
    }

    @Override
    public void createForm(RegistrationForm registrationForm) {
        iRegistrationFormRepository.save(registrationForm);
    }
}
