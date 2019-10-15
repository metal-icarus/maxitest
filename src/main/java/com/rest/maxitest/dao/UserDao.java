package com.rest.maxitest.dao;

import java.util.List;

import com.rest.maxitest.model.User;

public interface UserDao {

	List<User> getAllUsers();
	
	public User getUserById(int id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
}
