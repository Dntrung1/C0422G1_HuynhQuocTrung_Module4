package com.codegym.controller;

import com.codegym.dto.CustomerDto;
import com.codegym.model.customer.Customer;
import com.codegym.service.ICustomerService;
import com.codegym.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("customertype", iCustomerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/savecustomer")
    public String saveCustomer(@ModelAttribute @Valid CustomerDto customerDto, BindingResult bindingResult,
                               Model model, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            model.addAttribute("customerDto",customerDto);
            model.addAttribute("customertype", iCustomerTypeService.findAll());
            return "/customer/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customer.setCustomerType(iCustomerTypeService.findById(customerDto.getCustomerTypeDto().getIdCustomerType()));
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
        iCustomerService.updateCustomer(customer);
        return "redirect:/customer/list";
    }

    @PostMapping("/deletecustomer")
    public String deleteCustomer(@RequestParam int id){
        iCustomerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
