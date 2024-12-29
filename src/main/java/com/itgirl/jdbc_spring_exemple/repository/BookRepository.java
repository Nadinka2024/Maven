package com.itgirl.jdbc_spring_exemple.repository;

import com.itgirl.jdbc_spring_exemple.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAllBooks();

    Optional<Book> findById(Long id);
}
