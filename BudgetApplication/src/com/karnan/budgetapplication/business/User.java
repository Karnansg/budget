package com.karnan.budgetapplication.business;

public class User {
	private int userId;
	private String name;
	private String email;
	private int handphoneNumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	public int getHandphoneNumber() {
		return handphoneNumber;
	}
	public void setHandphoneNumber(int handphoneNumber) {
		this.handphoneNumber = handphoneNumber;
	}
}
