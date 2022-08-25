package com.codegym.service;

import com.codegym.model.RegistrationForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRegistrationFormService {
    Page<RegistrationForm> findAll(Pageable pageable);
    void createForm(RegistrationForm registrationForm);
}
