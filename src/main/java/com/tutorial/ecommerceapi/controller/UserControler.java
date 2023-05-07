package com.tutorial.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.ecommerceapi.Service.UserService;
import com.tutorial.ecommerceapi.model.User;

@RestController
@RequestMapping("/user")
public class UserControler {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public void adduser(@RequestBody User user) {
		
		
		userService.adduser(user);
		
	}
	
	@GetMapping("retrive")
	
	public List<User>getAllUsers(){
		
		
		return userService.getAllUsers();
		
	}
	
	@GetMapping("retrive/id/{id}")
	
	public User getUserById(@PathVariable("id") Long id) {
		
		
		return userService.getUserById(id);
	}
	
}
