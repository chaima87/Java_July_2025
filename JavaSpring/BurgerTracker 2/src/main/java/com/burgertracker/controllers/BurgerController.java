package com.burgertracker.controllers;

import com.burgertracker.models.Burger;
import com.burgertracker.services.BurgerService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @GetMapping("/")
    public String index(@ModelAttribute("burger") Burger burger, Model model) {
        model.addAttribute("allBurgers", burgerService.allBurgers());
        return "index";
    }

    @PostMapping("/burgers")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("allBurgers", burgerService.allBurgers());
            return "index";
        }
        burgerService.createBurger(burger);
        return "redirect:/";
    }
    @GetMapping("/burgers/edit/{id}")
    public String editBurger(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findById(id);
        model.addAttribute("burger", burger);
        return "edit";
    }
    @PostMapping("/burgers/update/{id}")
    public String updateBurger(
        @Valid @ModelAttribute("burger") Burger burger,
        BindingResult result,
        Model model
    ) {
        if (result.hasErrors()) {
            return "edit";
        }
        burgerService.update(burger);
        return "redirect:/";
    }


}
