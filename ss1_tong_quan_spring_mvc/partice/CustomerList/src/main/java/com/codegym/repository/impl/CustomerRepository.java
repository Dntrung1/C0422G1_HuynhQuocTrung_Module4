package com.codegym.repository.impl;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(0,"Trung","dntrung@gmail.com","Da Nang"));
        customers.add(new Customer(1,"Trung1","dntrung1@gmail.com","Hue"));
        customers.add(new Customer(2,"Trung2","dntrung2@gmail.com","Quang Nam"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
