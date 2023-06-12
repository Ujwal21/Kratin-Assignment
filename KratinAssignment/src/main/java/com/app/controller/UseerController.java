package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.services.UserService;

@RestController
@RequestMapping("/user/login/add/")
@CrossOrigin("*")
public class UseerController {
    
	@Autowired
	
	private UserService userService;
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To Kratin ";
	}
	
	//get the users details
	/*as we meant to made for single user thats why we are
	using only getUser if we have list
	 of users then we can also call getUsers */
	@GetMapping("/user")
	public List<User> getUser(){
		
		return this.userService.getUser();
		
	}
	//If we want to add new User then we will use following method
	@PostMapping(path = "/user", consumes="application/json")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
		
	}
	
	// To update the user data
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
	//To delete user
	@DeleteMapping("/user/{userContact}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userContact){
		try {
			this.userService.deleteUser(Long.parseLong(userContact));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	
	
}
