package com.rest.maxitest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.maxitest.model.User;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

}
