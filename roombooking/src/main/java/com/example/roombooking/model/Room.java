package com.example.roombooking.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection="rooms")
public class Room {
	
	@Id
	private String id;
	private String roomNumber;
	private String roomType;
	private int numberOfPersons;
	private double costPerDay;
	private List<String> amenities;

	// Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getRoomNumber() {
		return roomnumber;
	}
    public void setRoomNumber(String roomNUmber) {
	    this.roomNumber = roomNumber;
}  
    
    public String getRoomType() {
		return roomType;
	}
    public void setRoomType(String roomType) {
	    this.roomType = roomType;
}  
    public int getNumberOfPersons() {
		return numberOfPersons;
	}
    public void setNumberOfPersons(int numberOfPersons) {
	    this.numberOfPersons = numberOfPersons;
}  
    public double getCostPerDay() {
		return costPerDay;
	}
    public void setCostPerDay(double costPerDay) {
	    this.costPerDay = costPerDay;
}  
    public List<String> getAmenities() {
		return amenties;
	}
    public void setAmenities(List<String> amenities) {
	    this.amenities = amenities;  
}