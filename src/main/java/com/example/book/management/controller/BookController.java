package com.example.book.management.controller;
import com.example.book.management.model.BookManagement;
import com.example.book.management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;


    @Autowired
    public void setBookService(BookService clientService) {
        this.bookService = clientService;
    }


    @PostMapping
    public BookManagement addBook(@RequestBody BookManagement bookManagement) {
        return bookService.addBook(bookManagement);
    }
    @PutMapping("/{id}")
    public BookManagement updateBook(@PathVariable Long id, @RequestBody BookManagement bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }

    @GetMapping("/verify")
    public String verify(){
        return "hello";
    }

    @GetMapping
    public List<BookManagement> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookManagement getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }



}
