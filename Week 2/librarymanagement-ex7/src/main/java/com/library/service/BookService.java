package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Constructor Injection
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayService() {
        System.out.println("Book Service Bean Created using Constructor and Setter Injection");
        repository.displayRepository();
    }
}