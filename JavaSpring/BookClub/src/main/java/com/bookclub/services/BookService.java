package com.bookclub.services;

import org.springframework.stereotype.Service;
import com.bookclub.models.Book;
import com.bookclub.repositories.BookRepository;

import jakarta.validation.Valid;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Get all books
    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    
    // Save a book (create or update)
    public Book save(@Valid Book book) {
        return bookRepo.save(book);
    }

    // Find a book by ID
    public Book findBookById(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        return optionalBook.orElse(null);
    }

    // Update an existing book
    public Book updateBook(@Valid Book book) {
        return bookRepo.save(book);
    }

    // Delete a book by ID
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
