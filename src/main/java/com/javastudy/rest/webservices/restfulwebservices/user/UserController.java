package com.javastudy.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userDaoService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User retrieveOneUser(@PathVariable int id) {
		return userDaoService.findOne(id);
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		User savedUser = userDaoService.saveUser(user);
		return "User added successfully!!";
	}
}
