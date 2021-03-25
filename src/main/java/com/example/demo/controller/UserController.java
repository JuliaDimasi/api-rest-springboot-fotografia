package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	 @Autowired
	    private UserService userService;
	        
	    @GetMapping
	    public List<User> findAllUsers() {
	        // Implement
	    	List<User> users = new ArrayList<User>();
	    	users = this.userService.findAllUsers();
	    	return users;
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
	       // Implement
	    	return null;
	    }

	    @PostMapping
	    public User saveUser( @RequestBody User user) {
	        // Implement
	    	return null;
	    }


}



   