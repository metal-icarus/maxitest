package com.rest.maxitest.model;

import javax.persistence.Entity;

@Entity
public class User extends Person{

	private String role;
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
