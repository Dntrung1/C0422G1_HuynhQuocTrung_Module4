package com.codegym.repository;

import com.codegym.model.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contact, Integer> {

}
