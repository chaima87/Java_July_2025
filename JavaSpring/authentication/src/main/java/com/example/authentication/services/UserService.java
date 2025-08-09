package com.example.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.authentication.controllers.LoginUser;
import com.example.authentication.controllers.User;
import com.example.authentication.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    // Register user
    public User register(User newUser, BindingResult result) {
        // Check if email is already taken
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Exists", "Email already in use");
        }
        
        // Check if password matches confirm
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "Passwords must match");
        }
        
        if(result.hasErrors()) {
            return null;
        }
        
        // Hash password and save user
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        
        return userRepo.save(newUser);
    }
    
    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }


    // Login user
    public User login(LoginUser newLogin, BindingResult result) {
        // Find user by email
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "NotFound", "Invalid Email/Password");
            return null;
        }
        
        User user = potentialUser.get();
        
        // Check password
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Invalid", "Invalid Email/Password");
            return null;
        }
        
        if(result.hasErrors()) {
            return null;
        }
        
        return user;
    }
}
