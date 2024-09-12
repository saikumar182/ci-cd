package com.example.book.management.service;

import com.example.book.management.model.BookManagement;
import com.example.book.management.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public BookManagement addBook(BookManagement book) {
        return bookRepository.save(book);
    }

    public BookManagement updateBook(Long id, BookManagement bookDetails) {
        BookManagement book = bookRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Book id  not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPublishedDate(bookDetails.getPublishedDate());
        return bookRepository.save(book);
    }

        public List<BookManagement> getAllBooks() {
            return bookRepository.findAll();
        }


    public BookManagement getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() ->
                new RuntimeException("book id not found"));
    }
}
