package com.rest.maxitest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.maxitest.model.User;

@Repository("userJpaRepository")
public interface UserJpaRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT * FROM user", nativeQuery=true)
	public List<User> findAll();
	
	public User findById(int id);
	
	public List<User> findByRole(String role);
	
	public User save(User user);
	
	public User update(User user);
	
	public void delete(User user);
	
	@Query(value = "SELECT * FROM user u where u.name = ?0 AND u.numberId = ?1", nativeQuery=true)
	public List<User> findByNameAndNumberId(String name, int numberId);
	
	
	
}
