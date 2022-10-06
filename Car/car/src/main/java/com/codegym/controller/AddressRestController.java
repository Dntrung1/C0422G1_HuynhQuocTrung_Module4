package com.codegym.controller;

import com.codegym.model.Address;
import com.codegym.model.Car;
import com.codegym.repository.IAddressRepository;
import com.codegym.service.IAddressService;
import com.codegym.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class AddressRestController {
    @Autowired
    private IAddressService addressService;

    @GetMapping("/listAddress")
    public ResponseEntity<List<Address>> getAll(){
        List<Address> addresses = this.addressService.findAll();
        if (addresses.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(addresses,HttpStatus.OK);
    }

}
