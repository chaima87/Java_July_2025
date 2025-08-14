package com.bookclub.controllers;

import com.bookclub.models.Book;
import com.bookclub.models.User;
import com.bookclub.services.BookService;
import com.bookclub.services.UserService;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    private final UserService userService;

    public BookController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    // Show all books
    @GetMapping
    public String listBooks(Model model, HttpSession session) {
        model.addAttribute("books", bookService.getAllBooks());

        // Add current user for navbar
        addCurrentUserToModel(model, session);

        return "books"; 
    }

    // Show a single book detail
    @GetMapping("/{id}")
    public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        Book book = bookService.findBookById(id);
        if (book == null) return "redirect:/books";

        model.addAttribute("book", book);
        addCurrentUserToModel(model, session);

        return "bookDetail"; 
    }

    // Show create book form
    @GetMapping("/create")
    public String showCreateForm(Model model, HttpSession session) {
        model.addAttribute("book", new Book());
        addCurrentUserToModel(model, session);
        return "createBook"; 
    }

    // Handle create book form submission
    @PostMapping("/create")
    public String createBook(@Valid @ModelAttribute("book") Book book,
                             BindingResult result,
                             Model model,
                             HttpSession session) {
        if (result.hasErrors()) {
            addCurrentUserToModel(model, session);
            return "createBook";
        }
        bookService.save(book);
        return "redirect:/books";
    }

    // Show edit book form
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable("id") Long id, Model model, HttpSession session) {
        Book book = bookService.findBookById(id);
        if (book == null) return "redirect:/books";

        model.addAttribute("book", book);
        addCurrentUserToModel(model, session);

        return "editBook"; 
    }

    // Handle edit book form submission
    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") Long id,
                             @Valid @ModelAttribute("book") Book book,
                             BindingResult result,
                             Model model,
                             HttpSession session) {
        if (result.hasErrors()) {
            addCurrentUserToModel(model, session);
            return "editBook";
        }
        book.setId(id); 
        bookService.updateBook(book);
        return "redirect:/books";
    }

    // Delete book
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

    // Helper method to add current user to model
    private void addCurrentUserToModel(Model model, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId != null) {
            User currentUser = userService.findById(userId);
            model.addAttribute("currentUser", currentUser);
        }
    }
}
