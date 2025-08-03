package com.example.hopperreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceiptController {

    @RequestMapping("/receipt")
    public String showReceipt(Model model) {
        model.addAttribute("name", "Nikola Tesla");
        model.addAttribute("itemName", "Tesla Coil");
        model.addAttribute("price", 499.99);
        model.addAttribute("description", "High voltage resonant transformer");
        model.addAttribute("vendor", "Tesla Innovations");

        return "jsp/receipt";
    }
}
