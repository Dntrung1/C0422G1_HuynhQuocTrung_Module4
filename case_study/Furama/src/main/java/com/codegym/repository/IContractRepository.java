package com.codegym.repository;

import com.codegym.common.IContractTotal;
import com.codegym.model.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IContractRepository extends JpaRepository<Contact, Integer> {
    @Query(value = "SELECT \n" +
            "    c.customer_name AS customerName,\n" +
            "    ct.id_contact AS idContact,\n" +
            "    f.name AS facilityName,\n" +
            "    ct.start_date AS startDate,\n" +
            "    ct.end_date AS endDate,\n" +
            "    ct.deposit AS deposit,\n" +
            "    f.cost + SUM(IFNULL(ctdt.quantity * af.cost, 0)) AS total\n" +
            "FROM\n" +
            "    `contact` as ct\n" +
            "        LEFT JOIN\n" +
            "    `customer` as  c ON c.id_customer = ct.customer\n" +
            "        LEFT JOIN\n" +
            "    `facility` as  f ON f.id_service = ct.facility\n" +
            "        LEFT JOIN\n" +
            "    `contact_detail` as ctdt ON ctdt.contact = ct.id_contact\n" +
            "        LEFT JOIN\n" +
            "    `attach_facility` as af ON af.id = ctdt.attach_facility\n" +
            "GROUP BY ct.id_contact", nativeQuery = true)
    List<IContractTotal> contactTotal();
}
