package com.codegym.controller;

import com.codegym.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @Autowired
    private ISandwichService iSandwichService;

    @GetMapping("/")
    public String optionSandwich(Model model) {
        model.addAttribute("option", iSandwichService.findAll());
        return "home";
    }

    @PostMapping("/option")
    public String saveSandwich(@RequestParam String[] option, Model model) {
        model.addAttribute("option", option);
        return "result";
    }
}
