package com.example.controller;

import com.example.service.IConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionController {
    @Autowired
    private IConversionService iConversionService;
    @GetMapping("/conversion")
    public String conversion(@RequestParam String usd, String rate, Model model){
        if (usd.equals("")||rate.equals("")){
            model.addAttribute("result","Vui lòng nhập vào");
        }else {
            double result = iConversionService.conversion(usd,rate);
            model.addAttribute("result",result);
            model.addAttribute("usd",usd);
            model.addAttribute("rate",rate);
        }
       return "/index";
    }
}
