package com.codegym.service.impl;

import com.codegym.model.Email;
import com.codegym.repository.IEmailRepository;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {
    @Autowired
    private IEmailRepository emailRepository;

    @Override
    public void saveEmail(Email email) {
        emailRepository.saveEmail(email);
    }

    @Override
    public Email viewEmail() {
        return emailRepository.viewEmail();
    }
}
