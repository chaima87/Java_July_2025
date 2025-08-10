package com.example.studentroster.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "dorms")
public class Dorm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private String name;

    @OneToMany(mappedBy = "dorm", fetch = FetchType.LAZY)
    private List<Student> students;

    public Dorm() {}

    public Dorm(String name) {
        this.name = name;
    }

}
