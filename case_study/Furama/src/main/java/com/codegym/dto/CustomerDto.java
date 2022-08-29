package com.codegym.dto;

public class CustomerDto {
    private int idCustomer;
    private String name;
    private String birthday;
    private boolean gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private String customerTypeId;
    private boolean status;

    public CustomerDto() {
    }

    public CustomerDto(int idCustomer, String name, String birthday, boolean gender,
                       String idCard, String phone, String email, String address, String customerTypeId, boolean status) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerTypeId = customerTypeId;
        this.status = status;
    }

    public CustomerDto(String name, String birthday, boolean gender,
                       String idCard, String phone, String email, String address, String customerTypeId, boolean status) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerTypeId = customerTypeId;
        this.status = status;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
