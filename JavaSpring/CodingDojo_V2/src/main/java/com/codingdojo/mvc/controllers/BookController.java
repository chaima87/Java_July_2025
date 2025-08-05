package com.codingdojo.mvc.controllers;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        if (book != null) {
            model.addAttribute("book", book);
            return "/books/show"; // ✅ Return full JSP path
        } else {
            return "redirect:/books"; // ✅ Redirect to correct route
        }
    }
        @RequestMapping("/books")
        public String index(Model model) {
            List<Book> books = bookService.allBooks();
            model.addAttribute("books", books);
            return "/books/index";
        }
    }


