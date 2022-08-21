package com.codegym.controller;

import com.codegym.model.MusicApp;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MusicController {

    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/")
    public String listMusic(Model model) {
        model.addAttribute("list", iMusicService.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String showAddMusic(Model model) {
        model.addAttribute("music", new MusicApp());
        return "add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MusicApp musicApp, RedirectAttributes redirectAttributes) {
        iMusicService.saveMusic(musicApp);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/";
    }

    @GetMapping("/showEdit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute MusicApp musicApp, RedirectAttributes redirectAttributes) {
        iMusicService.updateMusic(musicApp);
        redirectAttributes.addFlashAttribute("mess", "Cập nhật thành công");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        iMusicService.deleteMusic(id);
        return "redirect:/";
    }
}
