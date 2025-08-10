package com.example.studentroster.controllers;

import com.example.studentroster.models.Dorm;
import com.example.studentroster.models.Student;
import com.example.studentroster.services.DormService;
import com.example.studentroster.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private final DormService dormService;
    private final StudentService studentService;

    public MainController(DormService dormService, StudentService studentService) {
        this.dormService = dormService;
        this.studentService = studentService;
    }

    // Show all dorms: 
    @GetMapping("/dorms")
    public String dorms(Model model) {
        model.addAttribute("dorms", dormService.allDorms());
        return "dorms";
    }

    // New dorm form
    @GetMapping("/dorms/new")
    public String newDorm(@ModelAttribute("dorm") Dorm dorm) {
        return "NewDorm";
    }

    @PostMapping("/dorms")
    public String createDorm(@ModelAttribute("dorm") Dorm dorm) {
        dormService.createDorm(dorm);
        return "redirect:/dorms";
    }

    // New student form
    @GetMapping("/students/new")
    public String newStudent(Model model) {
        model.addAttribute("student", new Student()); 
        model.addAttribute("dorms", dormService.allDorms());
        return "NewStudent";
    }
    
    @GetMapping("/students")
    public String allStudents(Model model) {
        model.addAttribute("students", studentService.allStudents());
        return "students"; 
    }

    @PostMapping("/students")
    public String createStudent(@ModelAttribute("student") Student student) {
        // Fetch dorm from DB using its id
        Dorm dorm = dormService.findDorm(student.getDorm().getId());
        student.setDorm(dorm);

        // Save student
        studentService.createStudent(student);
        return "redirect:/students"; // redirect to students list instead of dorms
    }


    // Show students in a dorm
    @GetMapping("/dorms/{id}")
    public String showDorm(@PathVariable("id") Long id, Model model) {
        Dorm dorm = dormService.findDorm(id);
        model.addAttribute("dorm", dorm);
        return "students";
    }
    @PostMapping("/students/{id}/delete")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

}
