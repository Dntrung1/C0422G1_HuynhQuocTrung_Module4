package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired private IBlogService iBlogService;
    @GetMapping("/")
    public String listMusic(Model model) {
        model.addAttribute("list", iBlogService.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String showAddMusic(Model model) {
        model.addAttribute("blog", new Blog());
        return "add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/";
    }

    @GetMapping("/showEdit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id).get());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("mess", "Cập nhật thành công");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        iBlogService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/showDetails")
    public String showDetails(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id).get());
        return "details";
    }
}
