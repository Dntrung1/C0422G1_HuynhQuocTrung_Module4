package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "xe")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String soXe;
    private String loaiXe;
    private String tenNhaXe;
    private String soDienThoai;
    private String email;
    private String gioDi;
    private String gioDen;
    private boolean trangThai;
    @ManyToOne
    @JoinColumn(name = "diem_di", referencedColumnName = "id")
    private Address diemDi;
    @ManyToOne
    @JoinColumn(name = "diem_den", referencedColumnName = "id")
    private Address diemDen;
}
