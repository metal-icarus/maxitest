package com.rest.maxitest.dao;

import java.util.ArrayList;
import java.util.List;

import com.rest.maxitest.model.User;

public class UserDaoImpl implements UserDao {
	
	private List<User>users = new ArrayList<>();

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUserById(int id) {
		return users.get(id);
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void updateUser(User user) {
		users.add(user);

	}

	@Override
	public void deleteUser(User user) {
		users.remove(user);

	}

}
