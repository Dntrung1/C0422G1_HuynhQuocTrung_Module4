package com.codegym.controller;

import com.codegym.model.contact.AttachFacility;
import com.codegym.model.contact.Contact;
import com.codegym.model.contact.ContactDetail;
import com.codegym.service.IAttachFacilityService;
import com.codegym.service.IContactService;
import com.codegym.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        return "contact/list";
    }

    @GetMapping("/showAttachFacility")
    public String showAttachFacility(Model model,@RequestParam int id){
        model.addAttribute("attachFacility",iAttachFacilityService.findAllBy(id));
        return "redirect:/contact/list";
    }


    @PostMapping("/createContractDetail")
    public String createContractDetail(@RequestParam int idContract, @RequestParam String[] idAttachFacility){
        String[] arrContractDetail = idAttachFacility;
        System.out.println(Arrays.toString(arrContractDetail));
        List<String> contractDetailList = new ArrayList<>();
        for (int i = 0; i < arrContractDetail.length; i++) {
            if (!arrContractDetail[i].equals("")){
                contractDetailList.add(arrContractDetail[i]);
            }
        }
        System.out.println(contractDetailList);
        for (int i = 0; i < contractDetailList.size(); i++) {
                AttachFacility attachFacility = iAttachFacilityService.findById(Integer.parseInt(contractDetailList.get(i)));
                Contact contact = iContactService.findById(idContract);
                ContactDetail contactDetails = new ContactDetail(Integer.parseInt(contractDetailList.get(i+1)),
                        attachFacility,contact);
                iContractDetailService.createContractDetail(contactDetails);
            System.out.println(contractDetailList);
                i++;
        }
        return "redirect:/contact/list";
    }
}
