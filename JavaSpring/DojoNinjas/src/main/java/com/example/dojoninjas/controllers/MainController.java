package com.example.dojoninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojoninjas.models.Dojo;
import com.example.dojoninjas.models.Ninja;
import com.example.dojoninjas.repositories.DojoRepository;
import com.example.dojoninjas.repositories.NinjaRepository;

import jakarta.validation.Valid;

@Controller
public class MainController {
    @Autowired
    private DojoRepository dojoRepo;

    @Autowired
    private NinjaRepository ninjaRepo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dojos", dojoRepo.findAll());
        return "index";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojoForm";
    }

    @PostMapping("/dojos")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "dojoForm";
        }
        dojoRepo.save(dojo);
        return "redirect:/";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(Model model) {
        model.addAttribute("ninja", new Ninja());
        model.addAttribute("dojos", dojoRepo.findAll());
        return "ninjaForm";
    }
    
    @GetMapping("/ninjas")
    public String listNinjas(Model model) {
        model.addAttribute("ninjas", ninjaRepo.findAll());
        return "ninjaList";
    }


    @PostMapping("/ninjas")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoRepo.findAll());
            return "ninjaForm";
        }
        ninjaRepo.save(ninja);
        return "redirect:/";
    }

    @GetMapping("/dojos/{id}")
    public String dojoDetails(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoRepo.findById(id).orElse(null);
        model.addAttribute("dojo", dojo);
        return "dojoDetails";
    }
}
