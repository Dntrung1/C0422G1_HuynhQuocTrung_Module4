package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/facility"})
public class FacilityController {
    @GetMapping("/list")
    public String listFacility(){
        return "/facility/list";
    }

    @GetMapping("/create")
    public String showCreate(){
        return "/facility/create";
    }
}
