package com.rest.maxitest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends Person{

	private String role;	
	
	public User(int id, String name, int numId, String role) {
		super();
		this.role = role;
	}

	@Column
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
