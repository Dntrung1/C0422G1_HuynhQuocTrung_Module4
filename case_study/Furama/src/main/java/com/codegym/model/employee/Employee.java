package com.codegym.model.employee;

import com.codegym.model.contact.Contact;
import com.codegym.model.customer.CustomerType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmployee;
    private String name;
    private String birthday;
    private String idCard;
    private String phone;
    private String email;
    private Double salary;
    private String address;
    @Column(columnDefinition = "bit(1)")
    private boolean employeeStatus;

    @ManyToOne
    @JoinColumn(name = "division", referencedColumnName = "idDivision")
    private EmployeeDivision employeeDivision;

    @ManyToOne
    @JoinColumn(name = "position", referencedColumnName = "idPosition")
    private EmployeePosition employeePosition;

    @ManyToOne
    @JoinColumn(name = "Employee_Level", referencedColumnName = "idLevel")
    private EmployLevel employLevel;
    public Employee() {
    }

    @OneToMany(mappedBy = "employee")
    private List<Contact> contacts;

    public Employee(int idEmployee, String name, String birthday, String idCard, String phone, String email, Double salary, String address, boolean employeeStatus,
                    EmployeeDivision employeeDivision, EmployeePosition employeePosition, EmployLevel employLevel, List<Contact> contacts) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.address = address;
        this.employeeStatus = employeeStatus;
        this.employeeDivision = employeeDivision;
        this.employeePosition = employeePosition;
        this.employLevel = employLevel;
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeDivision getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(EmployeeDivision employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployLevel getEmployLevel() {
        return employLevel;
    }

    public void setEmployLevel(EmployLevel employLevel) {
        this.employLevel = employLevel;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
