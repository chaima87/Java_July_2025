package com.example.omikuji;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String showForm() {
        return "omikujiForm";
    }

    @PostMapping("/omikuji/process")
    public String processForm(
        @RequestParam("number") String number,
        @RequestParam("city") String city,
        @RequestParam("person") String person,
        @RequestParam("hobby") String hobby,
        @RequestParam("thing") String thing,
        @RequestParam("nice") String nice,
        HttpSession session) {

        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);

        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("thing", session.getAttribute("thing"));
        model.addAttribute("nice", session.getAttribute("nice"));
        return "omikujiShow";
    }
}
