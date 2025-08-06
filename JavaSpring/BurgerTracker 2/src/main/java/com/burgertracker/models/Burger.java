package com.burgertracker.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name="burgers")

public class Burger {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotBlank(message="Burger name is required")
    private String burgerName;

    @NotBlank(message="Restaurant name is required")
    private String restaurantName;

    @Min(value=1, message="Rating must be at least 1")
    @Max(value=5, message="Rating cannot be more than 5")
    private int rating;

    @NotBlank(message="Notes are required")
    private String notes;

    
    // Constructors
    public Burger() {}

    // Getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
