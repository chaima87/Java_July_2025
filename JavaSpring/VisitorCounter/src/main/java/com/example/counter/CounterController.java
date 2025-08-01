package com.example.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CounterController {

    @Autowired
    private CounterService counterService;

    @GetMapping("/")
    public String home() {
        counterService.increment();
        return "redirect:/counter";
    }

    @GetMapping("/counter")
    public String counter(Model model) {
        model.addAttribute("count", counterService.getCount());
        return "counter";
    }

    @GetMapping("/increment-by-2")
    public String incrementBy2() {
        counterService.incrementByTwo();
        return "redirect:/counter";
    }

    @PostMapping("/reset")
    public String reset() {
        counterService.reset();
        return "redirect:/counter";
    }
}
