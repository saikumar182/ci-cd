package com.example.book.management.response;

import com.example.book.management.model.BookManagement;
import com.example.book.management.request.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private String title;
    private String author;
    private LocalDate publishedDate;


    public  BookResponse(BookManagement bookRequest) {
        this.author=bookRequest.getAuthor();
        this.publishedDate=bookRequest.getPublishedDate();
        this.title=bookRequest.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}
