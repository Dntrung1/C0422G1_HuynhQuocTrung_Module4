package com.codegym.controller;

import com.codegym.model.contact.Contact;
import com.codegym.service.IAttachFacilityService;
import com.codegym.service.IContactService;
import com.codegym.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired private IContactService iContactService;
    @Autowired private IAttachFacilityService iAttachFacilityService;
    @Autowired private IContractDetailService iContractDetailService;
    @GetMapping("/list")
    public String listContact(Model model, @PageableDefault(size = 5)Pageable pageable){
        model.addAttribute("listContact",iContactService.findAll(pageable));
        model.addAttribute("listAttachFacility",iAttachFacilityService.findAll());
        model.addAttribute("contract",new Contact());
        return "contact/list";
    }

    @GetMapping("/showAttachFacility")
    public String showAttachFacility(Model model,@RequestParam int id){
        model.addAttribute("attachFacility",iAttachFacilityService.findAllBy(id));
        return "redirect:/contact/list";
    }


    @PostMapping("/createContractDetail")
    public String createContractDetail(@RequestParam int idContract, @RequestParam String[] idAttachFacility){
        iContractDetailService.createContractDetail(idContract,idAttachFacility);
        return "redirect:/contact/list";
    }
}
