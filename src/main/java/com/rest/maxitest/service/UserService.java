package com.rest.maxitest.service;

import java.util.List;

import com.rest.maxitest.model.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(int userId);
	
	public User addUser(User newUser);
	
	public User updateUser(int userId, User Ouser);
	
	public void deleteUser(User user);

}
