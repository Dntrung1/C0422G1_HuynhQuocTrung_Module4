package com.codegym.controller;

import com.codegym.model.facility.Facility;
import com.codegym.service.IFacilityService;
import com.codegym.service.IFacilityTypeService;
import com.codegym.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String listFacility(Model model, @PageableDefault(size = 5)Pageable pageable){
        model.addAttribute("listFacility", iFacilityService.findAll(pageable));
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
    public String saveFacility(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes){
        iFacilityService.createFacility(facility);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/facility/list";
    }

    @GetMapping("/showUpdate")
    public String showUpdate(Model model, @RequestParam int id){
        model.addAttribute("facility",iFacilityService.findById(id));
        model.addAttribute("facilityType",iFacilityTypeService.findAll());
        model.addAttribute("rentType",iRentTypeService.findAll());
        return "facility/update";
    }

    @PostMapping("/updateFacility")
    public String updateFacility(@ModelAttribute Facility facility){
        iFacilityService.updateFacility(facility);
        return "redirect:/facility/list";
    }
}
