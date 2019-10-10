package com.rest.maxitest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.maxitest.model.User;

@Service
public class UserService {
	
	public List<User> usersList = null;
	
	public List<User> getUsers() {
		
		return usersList;
	}
	
	public User getUser(int userId) {
		
		for(User user : usersList) {
			if(user.getId()==userId)
				return user;				
		}
		return null;
	}
	
	public User addUser() {
		User newUser = new User();
		newUser.setName("name");
		newUser.setNumberId(1234567);
		newUser.setRole("role");
		
		usersList.add(newUser);
		
		return newUser;
		
	}
	
	public User updateUser(int userId) {
		
		for(User user : usersList) {
			if (user.getId()==userId) {
				user.setName(name);
				user.setNumberId(numberId);
				user.setRole(role);
			}
			
			return user;
		}
		
		return null;
	}
	
	public void deleteUser(User user) {
		usersList.remove(user);
	}

}
