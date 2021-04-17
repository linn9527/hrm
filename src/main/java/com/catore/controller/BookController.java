package com.catore.controller;


import com.catore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    Book book;

    @RequestMapping("/index")
    public Book index(){
        return this.book;
    }
}
