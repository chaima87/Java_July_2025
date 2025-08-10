package com.example.studentroster.repositories;

import com.example.studentroster.models.Student;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAll();
}
