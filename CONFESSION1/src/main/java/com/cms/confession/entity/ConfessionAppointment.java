package com.cms.confession.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="confession1table")
public class ConfessionAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private LocalDateTime date;
    private String place;
    private LocalDateTime time;
    private String mobileNumber;
    private String status; // Confirmed, Rescheduled, Cancelled
    private String notes;
    private LocalDateTime rescheduledDate;
    private String rescheduledPlace;
    private LocalDateTime rescheduledTime;
    private String cancellationReason;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public LocalDateTime getRescheduledDate() {
		return rescheduledDate;
	}
	public void setRescheduledDate(LocalDateTime rescheduledDate) {
		this.rescheduledDate = rescheduledDate;
	}
	public String getRescheduledPlace() {
		return rescheduledPlace;
	}
	public void setRescheduledPlace(String rescheduledPlace) {
		this.rescheduledPlace = rescheduledPlace;
	}
	public LocalDateTime getRescheduledTime() {
		return rescheduledTime;
	}
	public void setRescheduledTime(LocalDateTime rescheduledTime) {
		this.rescheduledTime = rescheduledTime;
	}
	public String getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	public ConfessionAppointment(Long id, String name, int age, String gender, LocalDateTime date, String place,
			LocalDateTime time, String mobileNumber, String status, String notes, LocalDateTime rescheduledDate,
			String rescheduledPlace, LocalDateTime rescheduledTime, String cancellationReason) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.date = date;
		this.place = place;
		this.time = time;
		this.mobileNumber = mobileNumber;
		this.status = status;
		this.notes = notes;
		this.rescheduledDate = rescheduledDate;
		this.rescheduledPlace = rescheduledPlace;
		this.rescheduledTime = rescheduledTime;
		this.cancellationReason = cancellationReason;
	}
	public ConfessionAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
    
    
    
    
    
    
}
