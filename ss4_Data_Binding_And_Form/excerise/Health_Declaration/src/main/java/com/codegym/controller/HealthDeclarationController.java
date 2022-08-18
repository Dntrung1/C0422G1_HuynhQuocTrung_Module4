package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import com.codegym.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HealthDeclarationController {
    @Autowired
    private IDayService iDayService;
    @Autowired
    private IMonthService iMonthService;
    @Autowired
    private IYearService iYearService;
    @Autowired
    private INationalityService iNationalityService;
    @Autowired
    private ITravelInformationService iTravelInformationService;
    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", iMedicalService.findAllMedical());
        return "list";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("health", new MedicalDeclaration());
        model.addAttribute("day", iDayService.findAllDay());
        model.addAttribute("month", iMonthService.findAllMonth());
        model.addAttribute("year", iYearService.findAllYear());
        model.addAttribute("national", iNationalityService.findAllNation());
        model.addAttribute("travel", iTravelInformationService.findAllTravel());
        return "home";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MedicalDeclaration medicalDeclaration, RedirectAttributes redirectAttributes) {
        iMedicalService.save(medicalDeclaration);
        redirectAttributes.addFlashAttribute("mess", "Thêm thành công");
        return "redirect:/list";
    }

    @GetMapping("/showEdit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("health", iMedicalService.findid(id));
        model.addAttribute("day", iDayService.findAllDay());
        model.addAttribute("month", iMonthService.findAllMonth());
        model.addAttribute("year", iYearService.findAllYear());
        model.addAttribute("national", iNationalityService.findAllNation());
        model.addAttribute("travel", iTravelInformationService.findAllTravel());
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute MedicalDeclaration medicalDeclaration, RedirectAttributes redirectAttributes) {
        iMedicalService.edit(medicalDeclaration);
        redirectAttributes.addFlashAttribute("mess", "Sửa thành công");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iMedicalService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công");
        return "redirect:/list";
    }

    @GetMapping("/details")
    public String details(@RequestParam int id, Model model) {
        MedicalDeclaration medicalDeclaration = iMedicalService.findid(id);
        model.addAttribute("details", medicalDeclaration);
        return "details";
    }
}
