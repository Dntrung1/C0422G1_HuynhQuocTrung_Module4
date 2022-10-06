package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "khach_hang")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;
    private String nameCustomer;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Transaction> transactions;

    public Customer(int idCustomer, String nameCustomer, String phone, String email, List<Transaction> transactions) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phone = phone;
        this.email = email;
        this.transactions = transactions;
    }

    public Customer() {
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Customer(int idCustomer, String phone, String email) {
        this.idCustomer = idCustomer;
        this.phone = phone;
        this.email = email;
    }

    public String getNameCustomer() {

        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
