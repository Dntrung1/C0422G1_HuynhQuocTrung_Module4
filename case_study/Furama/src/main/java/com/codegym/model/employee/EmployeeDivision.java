package com.codegym.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "division")
public class EmployeeDivision {
    @Id
    private int idDivision;
    private String nameDivision;

    @OneToMany(mappedBy = "employeeDivision")
    private List<Employee> employees;

    public EmployeeDivision() {
    }

    public EmployeeDivision(int idDivision, String nameDivision, List<Employee> employees) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.employees = employees;
    }

    public EmployeeDivision(int idDivision, String nameDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }
}
