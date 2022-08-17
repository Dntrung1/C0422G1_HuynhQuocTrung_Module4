package com.codegym.service;

import com.codegym.model.Email;

public interface IEmailService {
    void saveEmail(Email email);

    Email viewEmail();
}
