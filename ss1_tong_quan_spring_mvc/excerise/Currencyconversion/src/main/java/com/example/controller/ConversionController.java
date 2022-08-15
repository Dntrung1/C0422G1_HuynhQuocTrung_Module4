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
    IConversionService iConversionService;
    @GetMapping("/conversion")
    public String conversion(@RequestParam String soCanChuyenDoi, String tiGia, Model model){
        if (soCanChuyenDoi.equals("")||tiGia.equals("")){
            model.addAttribute("ketqua","Vui lòng nhập vào");
        }else {
            double soTien = iConversionService.conversion(soCanChuyenDoi,tiGia);
            model.addAttribute("ketqua",soTien);
            model.addAttribute("soCanChuyenDoi",soCanChuyenDoi);
            model.addAttribute("tiGia",tiGia);
        }
       return "/index";
    }
}
