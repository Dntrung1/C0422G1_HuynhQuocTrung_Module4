package com.codegym.controller;

import com.codegym.model.customer.Customer;
import com.codegym.service.ICustomerService;
import com.codegym.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "/customer/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customertype", iCustomerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/savecustomer")
    public String saveCustomer(@ModelAttribute Customer customer){
        iCustomerService.createCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showedit")
    public String showEdit(@RequestParam int id, Model model){
        model.addAttribute("customer", iCustomerService.findById(id));
        model.addAttribute("listcustomertype", iCustomerTypeService.findAll());
        return "/customer/update";
    }

    @PostMapping("/updatecustomer")
    public String editCustomer(@ModelAttribute Customer customer){
        iCustomerService.createCustomer(customer);
        return "redirect:/customer/list";
    }

    @PostMapping("/deletecustomer")
    public String deleteCustomer(@RequestParam int id){
        iCustomerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
