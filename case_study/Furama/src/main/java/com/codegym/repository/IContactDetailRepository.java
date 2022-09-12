package com.codegym.repository;

import com.codegym.model.contact.ContactDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContactDetailRepository extends JpaRepository<ContactDetail, Integer> {
    List<ContactDetail> findAllByContact_IdContact(int id);
}
