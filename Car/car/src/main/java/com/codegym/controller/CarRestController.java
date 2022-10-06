package com.codegym.controller;

import com.codegym.model.Car;
import com.codegym.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CarRestController {

    @Autowired
    private ICarService carService;

    @GetMapping("/list")
    public ResponseEntity<Page<Car>> getAll(Pageable pageable){
        Page<Car> cars = this.carService.findAll(pageable);
        if (cars.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cars,HttpStatus.OK);
    }

    @PatchMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        carService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Void> create(@RequestBody Car car){
        this.carService.create(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
