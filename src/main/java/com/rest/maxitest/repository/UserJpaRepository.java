package com.rest.maxitest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rest.maxitest.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer> {

	//@Query(value = "SELECT * FROM users")
	//public List<User> findAll();
	
	@Transactional
	public User findById(int id);
	
	@Transactional
	public List<User> findByRole(String role);
	
	//public User save(User user);
	
	//public User update(User user);
	
	//public void delete(User user);
	
	//@Query(value = "SELECT * FROM users u where u.name = ?0 AND u.numberId = ?1", nativeQuery=true)
	@Transactional
	public List<User> findByNameAndNumberId(String name, int numberId);
	
	
	
}
