package com.rest.maxitest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.maxitest.model.User;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT * FROM user", nativeQuery=true)
	public List<User> findAll();
	
	public List<User> findById(int id);
	
	public List<User> findByRole(String role);
	
	public User save(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	@Query(value = "SELECT * FROM user u where u.name = ?0 AND u.numberId = ?1", nativeQuery=true)
	public List<User> findByNameAndNumberId(String name, int numberId);
	
	
	
}
