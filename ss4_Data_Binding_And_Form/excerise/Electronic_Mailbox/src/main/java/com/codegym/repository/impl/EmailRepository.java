package com.codegym.repository.impl;

import com.codegym.model.Email;
import com.codegym.repository.IEmailRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository implements IEmailRepository {

    private Email email;

    @Override
    public void saveEmail(Email email) {
        this.email = email;
    }

    @Override
    public Email viewEmail() {
        return email;
    }

}
