package com.codegym.repository;

import com.codegym.model.Email;

public interface IEmailRepository {
    void saveEmail(Email email);

    Email viewEmail();
}
