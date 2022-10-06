package com.codegym.controller;

import com.codegym.model.employee.Employee;
import com.codegym.service.IEmployeeDivisionService;
import com.codegym.service.IEmployeeLevelService;
import com.codegym.service.IEmployeePositionService;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/employee"})
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IEmployeeDivisionService iEmployeeDivisionService;
    @Autowired
    private IEmployeeLevelService iEmployeeLevelService;
    @Autowired
    private IEmployeePositionService iEmployeePositionService;

    @GetMapping("/list")
    public String listEmployee(@PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("listEmployee", iEmployeeService.findAll(pageable));
        return "/employee/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("divisionList", iEmployeeDivisionService.findALl());
        model.addAttribute("levelList", iEmployeeLevelService.findAll());
        model.addAttribute("positionList", iEmployeePositionService.findAll());
        return "/employee/create";
    }

    @PostMapping("/saveEmployee")
    public String save(@ModelAttribute Employee employee){
        iEmployeeService.createEmployee(employee);
        return "redirect:/employee/list";
    }
}
