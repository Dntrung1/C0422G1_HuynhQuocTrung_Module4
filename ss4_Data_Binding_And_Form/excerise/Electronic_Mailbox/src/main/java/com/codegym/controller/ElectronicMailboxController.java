package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import com.codegym.service.ILanguageService;
import com.codegym.service.IPageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ElectronicMailboxController {
    @Autowired
    private ILanguageService iLanguageService;
    @Autowired
    private IPageSizeService iPageSizeService;
    @Autowired
    private IEmailService iEmailService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("language", iLanguageService.findAll());
        model.addAttribute("pagesize", iPageSizeService.findAll());
        model.addAttribute("email", new Email());
        return "home";
    }

    @PostMapping("/create")
    public String saveEmail(@ModelAttribute Email email, Model model) {
        iEmailService.saveEmail(email);
        model.addAttribute("create", iEmailService.viewEmail());
        return "create";
    }

}
