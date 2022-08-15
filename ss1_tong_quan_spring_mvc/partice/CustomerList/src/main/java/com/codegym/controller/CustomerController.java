package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @GetMapping("/customerList")
    public String ListCustomer(Model model){
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customerList",customerList);
        return "/customer/list";
    }
}
