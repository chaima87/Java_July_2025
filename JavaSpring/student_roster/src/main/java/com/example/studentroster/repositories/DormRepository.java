package com.example.studentroster.repositories;

import com.example.studentroster.models.Dorm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface DormRepository extends CrudRepository<Dorm, Long> {
    List<Dorm> findAll();

    @Query("SELECT d FROM Dorm d LEFT JOIN FETCH d.students WHERE d.id = :id")
    Dorm findByIdWithStudents(@Param("id") Long id);
}
