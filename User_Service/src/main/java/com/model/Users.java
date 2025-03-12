package com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Users { 
    @Id
    private String userId;
    private String name;
    private String email;
    private String about;
    
    @Transient
    private List<Rating> ratings = new ArrayList<>();
    

	// Default constructor (required for JSON serialization)
    public Users() {
    }

    // Parameterized constructor
    public Users(String userId, String name, String email, String about) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

	public void setHotels(List<Hotel> hotelList) {
		// TODO Auto-generated method stub
		
	}
}
