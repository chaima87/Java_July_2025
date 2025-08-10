package com.example.studentroster.services;

import com.example.studentroster.models.Dorm;
import com.example.studentroster.repositories.DormRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DormService {
    private final DormRepository dormRepo;

    public DormService(DormRepository dormRepo) {
        this.dormRepo = dormRepo;
    }

    public List<Dorm> allDorms() {
        return dormRepo.findAll();
    }

    public Dorm createDorm(Dorm dorm) {
        return dormRepo.save(dorm);
    }

    public Dorm findDorm(Long id) {
        return dormRepo.findByIdWithStudents(id);
    }


}
