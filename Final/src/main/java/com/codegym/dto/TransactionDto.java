package com.codegym.dto;

import com.codegym.model.Customer;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class TransactionDto {
    private int id;
    private String date;
    private String typeService;
    @NotBlank(message = "Vui lòng điền vào")
    @NotBlank
    private Double area;
    @NotBlank(message = "Vui lòng điền vào")
    private Double gia;
    private Customer customer;

    public TransactionDto() {
    }

    public TransactionDto(int id, String date, String typeService, Double area, Double gia, Customer customer) {
        this.id = id;
        this.date = date;
        this.typeService = typeService;
        this.area = area;
        this.gia = gia;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
