package com.bookclub.controllers;

import com.bookclub.models.User;
import com.bookclub.models.LoginUser;
import com.bookclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class AuthController {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showLoginAndRegister(Model model) {
        
        model.addAttribute("user", new User());        // registration form
        model.addAttribute("loginUser", new LoginUser()); // login form

        return "login"; 
    }


    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user,
                           BindingResult result,
                           HttpSession session,
                           Model model) {

        // Password confirmation check
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "Match", "Passwords must match");
        }

        // Check if email is already registered
        if (userService.findByEmail(user.getEmail()) != null) {
            result.rejectValue("email", "Exists", "Email is already registered");
        }

        if (result.hasErrors()) {
            model.addAttribute("loginUser", new LoginUser());
            return "login";
        }

        // Hash password before saving
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        User savedUser = userService.save(user);

        // Store user ID in session
        session.setAttribute("userId", savedUser.getId());
        return "redirect:/books";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser,
                        BindingResult result,
                        HttpSession session,
                        Model model) {

        // Find user by email
        User user = userService.findByEmail(loginUser.getEmail());

        // Check if user exists and password matches
        if (user == null || !bCryptPasswordEncoder.matches(loginUser.getPassword(), user.getPassword())) {
            result.rejectValue("email", "Invalid", "Invalid email or password");
            model.addAttribute("user", new User());
            return "login"; 
        }

        // Store the full User object in session for navbar access
        session.setAttribute("currentUser", user);

        // Redirect to book list page after successful login
        return "redirect:/books";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
