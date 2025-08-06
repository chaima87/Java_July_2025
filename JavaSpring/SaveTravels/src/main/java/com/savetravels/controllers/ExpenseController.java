package com.savetravels.controllers;

import com.savetravels.models.Expense;
import com.savetravels.services.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("expenses", service.allExpenses());
        model.addAttribute("expense", new Expense());
        return "index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("expense") Expense expense) {
        service.createExpense(expense);
        return "redirect:/";
    }

    @GetMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Expense e = service.findExpense(id);
        model.addAttribute("expense", e);
        return "show";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("expense", service.findExpense(id));
        return "edit";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("expense") Expense expense) {
        service.updateExpense(expense);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.deleteExpense(id);
        return "redirect:/";
    }
}
