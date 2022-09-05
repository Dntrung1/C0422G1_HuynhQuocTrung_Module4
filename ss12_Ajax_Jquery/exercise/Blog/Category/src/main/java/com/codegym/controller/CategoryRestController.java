package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categoryRests")
public class CategoryRestController {

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/")
    public ResponseEntity<List<Category>> goCategoryList(){
        List<Category> categoryList = iCategoryService.findAll();

        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }


}
