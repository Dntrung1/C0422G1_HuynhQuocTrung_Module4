package com.codegym.service.impl;

import com.codegym.model.Car;
import com.codegym.repository.ICarRepository;
import com.codegym.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {
    @Autowired
    private ICarRepository iCarRepository;
    @Override
    public Page<Car> findAll(Pageable pageable) {
        return this.iCarRepository.findAllCar(pageable);
    }

    @Override
    public Car findById(int id) {
        return null;
    }

    @Override
    public void create(Car car) {
        String email = car.getEmail();
        String gioDen = car.getGioDen();
        String gioDi = car.getGioDi();
        String loaiXe = car.getLoaiXe();
        String soDienThoai = car.getSoDienThoai();
        String soXe = car.getSoXe();
        String tenNhaXe = car.getTenNhaXe();
        int diemDen = car.getDiemDen().getId();
        int diemDi = car.getDiemDi().getId();
        this.iCarRepository.createCar(email,gioDen,gioDi,loaiXe,soDienThoai,soXe,tenNhaXe,diemDen,diemDi);
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void delete(int id) {
        this.iCarRepository.deleteCar(id);
    }
}
