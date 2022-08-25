package com.codegym.repository;

import com.codegym.model.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistrationFormRepository extends JpaRepository<RegistrationForm, Integer> {
}
