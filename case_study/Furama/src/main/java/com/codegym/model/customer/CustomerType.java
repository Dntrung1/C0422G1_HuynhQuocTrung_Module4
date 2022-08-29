package com.codegym.model.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Customer_Type")
public class CustomerType {

    @Id
    private Integer idCustomerType;
    private String name;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customerList;


    public CustomerType() {
    }

    public CustomerType(Integer idCustomerType, String name, List<Customer> customerList) {
        this.idCustomerType = idCustomerType;
        this.name = name;
        this.customerList = customerList;
    }

    public Integer getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Integer idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
