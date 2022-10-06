package com.codegym.controller;

import com.codegym.dto.TransactionDto;
import com.codegym.model.Transaction;
import com.codegym.service.ICustomerService;
import com.codegym.service.ITransactionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private ITransactionService iTransactionService;
    @Autowired
    private ICustomerService iCustomerService;

    @RequestMapping("")
    public String goToList(Model model){
        model.addAttribute("listTransaction",iTransactionService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("transactionDto", new TransactionDto());
        model.addAttribute("customerList", iCustomerService.findAll());
        return "/create";
    }

    @PostMapping("/save")
    public String saveFacility(@ModelAttribute @Valid TransactionDto transactionDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("transactionDto",transactionDto);
            model.addAttribute("customerList", iCustomerService.findAll());
            return "/create";
        }
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDto,transaction);
        transaction.setCustomer(iCustomerService.findById(transactionDto.getCustomer().getIdCustomer()));
        iTransactionService.create(transaction);
        return "redirect:";
    }

    @GetMapping("detail")
    public String goToDetail(@RequestParam int id, Model model){
        model.addAttribute("detail",iTransactionService.findById(id));
        return "/detail";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id){
        iTransactionService.delete(id);
        return "redirect:";
    }
}
