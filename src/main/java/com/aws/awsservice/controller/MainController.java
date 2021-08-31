package com.aws.awsservice.controller;

import com.aws.awsservice.model.Book;
import com.aws.awsservice.repository.BookRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> findBooks(){
        return bookRepository.findAll();
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public Book findBook(@PathVariable int id){
        Book book=bookRepository.findById(id).orElseThrow(() -> new Exception("Book error"));
        return book;
    }
}
