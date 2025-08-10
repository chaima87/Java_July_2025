package com.example.studentroster.services;

import com.example.studentroster.models.Student;
import com.example.studentroster.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> allStudents() {
        return studentRepo.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }
    
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

}
