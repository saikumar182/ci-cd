package com.example.book.management.repositories;
import com.example.book.management.model.BookManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookManagement,Long> {


}
