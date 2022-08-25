package com.codegym.controller;

import com.codegym.dto.RegistrationFormDto;
import com.codegym.model.RegistrationForm;
import com.codegym.service.IRegistrationFormService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    private IRegistrationFormService iRegistrationFormService;
    @GetMapping("/")
    public String showCreate(Model model){
        model.addAttribute("formDto", new RegistrationFormDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("formDto") @Valid RegistrationFormDto registrationFormDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new RegistrationFormDto().validate(registrationFormDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }
        RegistrationForm registrationForm = new RegistrationForm();
        BeanUtils.copyProperties(registrationFormDto,registrationForm);
        iRegistrationFormService.createForm(registrationForm);
        redirectAttributes.addFlashAttribute("msg",
                "Register successfully!");
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(@PageableDefault(size = 5) Pageable pageable, Model model){
        model.addAttribute("list",iRegistrationFormService.findAll(pageable));
        return "list";
    }

}
