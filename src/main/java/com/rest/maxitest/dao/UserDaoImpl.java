package com.rest.maxitest.dao;

import java.util.ArrayList;
import java.util.List;

import com.rest.maxitest.model.User;
import com.rest.maxitest.repository.UserJpaRepository;

public class UserDaoImpl implements UserDao {
	
	private List<User>users = new ArrayList<>();
	
	UserJpaRepository userJpaRepository;

	@Override
	public List<User> getAllUsers() {
		return userJpaRepository.findAll();
	}

	@Override
	public List<User> getUserById(int id) {
		return userJpaRepository.findById(id);
	}

	@Override
	public List<User> getUsersByRole(String role) {
		return userJpaRepository.findByRole(role);
	}
	
	@Override
	public void addUser(User user) {
		userJpaRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userJpaRepository.update(user);
	}

	@Override
	public void deleteUser(User user) {
		userJpaRepository.delete(user);

	}


	public List<User> getUserByNameAndNumberId(String name, int numberId){
		return userJpaRepository.findByNameAndNumberId(name, numberId);
	}

}
