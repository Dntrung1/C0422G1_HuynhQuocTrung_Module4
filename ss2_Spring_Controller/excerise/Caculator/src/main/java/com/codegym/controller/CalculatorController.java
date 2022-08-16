package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam String num1, @RequestParam String num2, @RequestParam String operand, Model model) {
        model.addAttribute("result", iCalculatorService.result(num1, num2, operand));
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "home";
    }
}
