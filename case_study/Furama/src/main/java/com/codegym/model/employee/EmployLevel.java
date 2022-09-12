package com.codegym.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Employee_Level")
public class EmployLevel {
    @Id
    private int idLevel;
    private String nameLevel;

    @OneToMany(mappedBy = "employLevel")
    private List<Employee> employees;

    public EmployLevel(int idLevel, String nameLevel, List<Employee> employees) {
        this.idLevel = idLevel;
        this.nameLevel = nameLevel;
        this.employees = employees;
    }

    public EmployLevel() {
    }

    public EmployLevel(int idLevel, String nameLevel) {
        this.idLevel = idLevel;
        this.nameLevel = nameLevel;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }
}
