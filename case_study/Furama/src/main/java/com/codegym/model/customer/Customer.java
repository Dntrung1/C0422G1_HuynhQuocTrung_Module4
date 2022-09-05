package com.codegym.model.customer;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCustomer;
    private String customerName;
    private String birthday;

    @Column(columnDefinition = "bit(1)")
    private boolean gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;

    @Column(columnDefinition = "bit(1)")
    private boolean customerStatus;

    @ManyToOne
    @JoinColumn(name = "customer_type", referencedColumnName = "idCustomerType")
    private CustomerType customerType;

    public Customer(Integer idCustomer, String customerName, String birthday, boolean gender, String idCard,
                    String phone, String email, String address, boolean customerStatus, CustomerType customerType) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerStatus = customerStatus;
        this.customerType = customerType;
    }

    public Customer() {
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public boolean isCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(boolean customerStatus) {
        this.customerStatus = customerStatus;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
