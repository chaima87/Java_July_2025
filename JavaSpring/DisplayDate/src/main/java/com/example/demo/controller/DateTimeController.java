package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class DateTimeController {

    @GetMapping("/")
    public String home() {
        return "dashboard"; // will render dashboard.html
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/date")
    public String date(Model model) {
        model.addAttribute("currentDate", LocalDate.now().toString());
        return "date";
    }

    @GetMapping("/time")
    public String time(Model model) {
        model.addAttribute("currentTime", LocalTime.now().toString());
        return "time";
    }
}

