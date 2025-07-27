package com.example.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class DaikichiController {

    @PostConstruct
    public void init() {
        System.out.println("✅ DaikichiController is loaded");
    }

    @RequestMapping("/daikichi")
    public String welcome() {
        return "Welcome!";
    }

    @RequestMapping("/daikichi/today")
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
