package com.codegym.controller;

import com.codegym.model.Phone;
import com.codegym.service.IPhoneService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/phoneRests")
public class PhoneRestController {
    @Autowired
    private IPhoneService iPhoneService;

    @GetMapping("")
    public ResponseEntity<List<Phone>> goToList(){
        List<Phone> phoneList = iPhoneService.findAll();
        if (phoneList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(phoneList,HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Void> createStudent(@RequestBody Phone phone) {
        iPhoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<Void> delete(@RequestParam int id){
        iPhoneService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
