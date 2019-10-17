package com.rest.maxitest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.maxitest.model.User;
import com.rest.maxitest.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	private UserService userService;
	
	@RequestMapping (value="/all", method=RequestMethod.GET)
	public ResponseEntity<?> getUsers() {
		
		List<User> users = userService.getUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping (value="/{userId}", method=RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int userId){
		
		User user = userService.getUser(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping (value="/add", method=RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody User user){
		
		User newUser = userService.addUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}
	
	@RequestMapping (value="/update/{userId}", method=RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable int userId, @RequestBody User user){
		
		User updatedUser = userService.updateUser(userId, user);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}
	
	@RequestMapping (value="/delete/{userId}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable int userId, @RequestBody User user){
		
		userService.deleteUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping (value="/", method=RequestMethod.GET)
	public ResponseEntity<?> home(){
		return new ResponseEntity<>("HOME MAXI", HttpStatus.OK);
	}
		
	

}
