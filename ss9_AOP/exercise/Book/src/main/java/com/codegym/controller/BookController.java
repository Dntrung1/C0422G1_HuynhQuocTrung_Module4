package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("/")
    public String showListBook(Model model) {
        model.addAttribute("list", iBookService.findAll());
        return "list";
    }

    @GetMapping("/detail")
    public String showDetail(@RequestParam int id, Model model) {
        model.addAttribute("detail", iBookService.findById(id));
        return "detail";
    }

    @GetMapping("/borrow")
    public String borrow(@RequestParam int id, Model model) throws Exception {
        Book book = iBookService.findById(id);
        if (book.getStatus() == 0) {
           throw new Exception();
        }
        book.setStatus(book.getStatus() - 1);
        iBookService.update(book);
        model.addAttribute("mess", "Mượn thành công");
        model.addAttribute("detail", iBookService.findById(id));
        return "detail";
    }

    @GetMapping("/pay")
    public String pay(){
        return "pay";
    }

    @PostMapping("payBook")
    public String payBook(@RequestParam int id,Model model) throws Exception {
        Book book = iBookService.findById(id);
        if (book==null){
            throw new Exception();
        }
        if (book.getStatus()>=book.getAmount()){
            model.addAttribute("mess","Đủ sách rồi");
            return "pay";
        }
        book.setStatus(book.getStatus()+1);
        iBookService.update(book);
        return "pay";
    }

    @ExceptionHandler(value = Exception.class)
    public String errors(){
        return "errors";
    }

}
