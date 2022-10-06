package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "giao_dich")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private String typeService;
    private Double area;
    private Double gia;

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "idCustomer")
    private Customer customer;

    public Transaction() {
    }

    public Transaction(int id, String date, String typeService, Double area, Double gia, Customer customer) {
        this.id = id;
        this.date = date;
        this.typeService = typeService;
        this.area = area;
        this.gia = gia;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Transaction(int id, String date, String typeService, Double area, Double gia) {
        this.id = id;
        this.date = date;
        this.typeService = typeService;
        this.area = area;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
}
