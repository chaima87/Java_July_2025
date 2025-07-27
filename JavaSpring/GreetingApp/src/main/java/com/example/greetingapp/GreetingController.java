package com.example.greetingapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greet(
            @RequestParam(value = "name", defaultValue = "human") String name,
            @RequestParam(value = "last_name", required = false) String lastName,
            @RequestParam(value = "times", defaultValue = "1") int times
    ) {
        String fullName = (lastName != null && !lastName.isEmpty()) ? name + " " + lastName : name;
        StringBuilder greetingBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            greetingBuilder.append("Hello ").append(fullName);
            if (i < times - 1) {
                greetingBuilder.append("\n");
            }
        }
        return greetingBuilder.toString();
    }
}
