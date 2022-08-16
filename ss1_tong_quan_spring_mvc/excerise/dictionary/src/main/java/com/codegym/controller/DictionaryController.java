package com.codegym.controller;

import com.codegym.repository.IDictionaryRepository;
import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;
    @GetMapping("/dictionary")
   public String dictionary(@RequestParam String word, Model model){
        String result = iDictionaryService.dictionary(word);
        model.addAttribute("word",word);
        model.addAttribute("result",result);
        return "index";
   }
}
