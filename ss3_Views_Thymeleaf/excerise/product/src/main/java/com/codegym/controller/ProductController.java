package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("list", iProductService.showList());
        return "list";
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.addProduct(product);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        iProductService.deleteProduct(id);
        return "redirect:/";
    }

    @GetMapping("/showEdit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.updateProduct(product);
        redirectAttributes.addFlashAttribute("mess", "Cập nhật thành công");
        return "redirect:/";
    }

    @GetMapping("/showDetails")
    public String showDetails(@RequestParam int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "details";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Model model) {
        model.addAttribute("list", iProductService.findByName(name));
        return "list";
    }
}
