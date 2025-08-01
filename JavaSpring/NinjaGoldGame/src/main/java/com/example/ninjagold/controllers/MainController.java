package com.example.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("log", new ArrayList<String>());
        }

        int gold = (int) session.getAttribute("gold");

        if (gold < -100) {
            return "redirect:/prison";
        }

        model.addAttribute("gold", gold);
        model.addAttribute("log", session.getAttribute("log"));

        return "index";
    }

    @PostMapping("/process")
    public String process(@RequestParam("location") String location, HttpSession session) {
        Random rand = new Random();
        int goldChange = 0;

        switch (location) {
            case "farm": goldChange = rand.nextInt(11) + 10; break;
            case "cave": goldChange = rand.nextInt(6) + 5; break;
            case "house": goldChange = rand.nextInt(4) + 2; break;
            case "quest": goldChange = rand.nextInt(101) - 50; break;
            case "spa": goldChange = -(rand.nextInt(16) + 5); break;
        }

        int gold = (int) session.getAttribute("gold") + goldChange;
        session.setAttribute("gold", gold);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String msg = "You entered the " + location + " and ";
        msg += (goldChange >= 0) ? "earned " + goldChange : "lost " + Math.abs(goldChange);
        msg += " gold. (" + time + ")";

        @SuppressWarnings("unchecked")
        List<String> log = (List<String>) session.getAttribute("log");
        log.add(0, msg);
        session.setAttribute("log", log);

        return "redirect:/";
    }

    @GetMapping("/reset")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/prison")
    public String prison() {
        return "prison";
    }
}
