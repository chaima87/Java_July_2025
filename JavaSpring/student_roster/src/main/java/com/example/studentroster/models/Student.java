package com.example.studentroster.models;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorm_id")
    private Dorm dorm;

    public Student() {}

    public Student(String name, Dorm dorm) {
        this.name = name;
        this.dorm = dorm;
    }
 // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Dorm getDorm() {
        return dorm;
    }
    public void setDorm(Dorm dorm) {
        this.dorm = dorm;
    }
}
