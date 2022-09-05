package com.codegym.controller;

import com.codegym.model.customer.Customer;
import com.codegym.model.facility.Facility;
import com.codegym.service.IFacilityService;
import com.codegym.service.IFacilityTypeService;
import com.codegym.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/facility"})
public class FacilityController {
    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IFacilityTypeService iFacilityTypeService;

    @Autowired
    private IRentTypeService iRentTypeService;
    @GetMapping("/list")
    public String listFacility(){
        return "/facility/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("facility",new Facility());
        model.addAttribute("facilityType",iFacilityTypeService.findAll());
        model.addAttribute("rentType",iRentTypeService.findAll());
        return "/facility/create";
    }

    @PostMapping("/saveFacility")
    public String saveCustomer(@ModelAttribute Facility facility){
        iFacilityService.createFacility(facility);
        return "redirect:/facility/list";
    }
}
