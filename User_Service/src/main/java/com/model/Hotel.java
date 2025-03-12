package com.model;

public class Hotel 
{
	private String id;
	private String name;
	private String location;
	private String about;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	 // Default constructor
    public Hotel() {
    }
    
	public Hotel(String id, String name, String location, String about) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.about = about;
	}
	
	 @Override
	    public String toString() {
	        return "Hotel{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", location='" + location + '\'' +
	                ", about='" + about + '\'' +
	                '}';
	 }

}
