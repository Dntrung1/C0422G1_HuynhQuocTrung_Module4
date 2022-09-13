package com.codegym.model.contact;

import com.codegym.model.customer.Customer;
import com.codegym.model.employee.Employee;
import com.codegym.model.facility.Facility;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;
    private String startDate;
    private String endDate;
    private Double deposit;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "employee", referencedColumnName = "idEmployee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "idCustomer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "facility", referencedColumnName = "idService")
    private Facility facility;

    @OneToMany(mappedBy = "contact")
    private List<ContactDetail> contactDetails;

    public Contact(int idContact, String startDate, String endDate, Double deposit,
                   Employee employee, Customer customer, Facility facility, List<ContactDetail> contactDetails) {
        this.idContact = idContact;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contactDetails = contactDetails;
    }

    public Contact(int idContact, String startDate, String endDate, Double deposit, Double total, Employee employee, Customer customer, Facility facility, List<ContactDetail> contactDetails) {
        this.idContact = idContact;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.total = total;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contactDetails = contactDetails;
    }

    public Contact() {
    }

    public Contact(int idContact, String startDate, String endDate, Double deposit, Employee employee, Customer customer, Facility facility) {
        this.idContact = idContact;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
