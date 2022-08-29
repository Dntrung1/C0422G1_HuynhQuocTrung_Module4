package com.codegym.controller;

import com.codegym.service.ICustomerService;
import com.codegym.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/customer"})
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @GetMapping("/list")
    public String listCustomer(@PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("listcustomer", iCustomerService.findAll(pageable));
        model.addAttribute("listcustomertype", iCustomerTypeService.findAll());
        return "/customer/list";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "/customer/create";
    }
}
