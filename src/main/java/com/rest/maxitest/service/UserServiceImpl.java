package com.rest.maxitest.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.rest.maxitest.model.User;
import com.rest.maxitest.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService{
	
	private List<User> usersList = null;
	private UserDaoImpl userDao = new UserDaoImpl();
	
	public List<User> getUsers() {
		
		return userDao.getAllUsers();
	}
	
	public User getUser(int userId) {
		
		for(User user : usersList) {
			if(user.getId()==userId)
				return userDao.getUserById(userId);				
		}
		return null;
	}
	
	@Override
	public List<User> getUsersByRole(String role) {
		return userDao.getUsersByRole(role);
	}
	
	public User addUser(User newUser) {
		newUser.setId(usersList.size()+1);
		usersList.add(newUser);
		
		return userDao.addUser(newUser);
		
	}
	
	public User updateUser(int userId, User Ouser) {
		
		for(User user : usersList) {
			if (user.getId()==userId) {
				user.setName(Ouser.getName());
				user.setNumberId(Ouser.getNumberId());
				user.setRole(Ouser.getRole());
			}
			
			return userDao.updateUser(user);
		}
		
		return null;
	}
	
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@PostConstruct
	private void setupUsers() {
		usersList = new ArrayList<User>();
		User user = new User();
		
		user.setId(1);
		user.setName("Maxi");
		user.setNumberId(31444333);
		user.setRole("Admin");
		usersList.add(user);
		
		user = new User();		
		user.setId(2);
		user.setName("Fabi");
		user.setNumberId(31333444);
		user.setRole("User");
		usersList.add(user);
		
		
	}

}
