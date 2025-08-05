package com.codingdojo.mvc.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
@RequestMapping("/api/books")
public class BooksApi {
    private final BookService bookService;

    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping("")
    public List<Book> index() {
        return bookService.allBooks();
    }

    @PostMapping("")
    public Book create(@RequestBody Book book) {
        return bookService.createBook(book);
    }


    @RequestMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        return bookService.findBook(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Book deleted successfully");

        return ResponseEntity.ok(response); // Returns 200 with message
    }

}
