package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dia_diem")
public class Address {
    @Id
    private int id;
    private String ten;
    @OneToMany(mappedBy = "diemDi")
    @JsonBackReference(value = "carListStart")
    private List<Car> carListStart;
    @OneToMany(mappedBy = "diemDen")
    @JsonBackReference(value = "carListEnd")
    private List<Car> carListEnd;
}
