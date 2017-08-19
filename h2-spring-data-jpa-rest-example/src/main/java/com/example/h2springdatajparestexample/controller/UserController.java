package com.example.h2springdatajparestexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.h2springdatajparestexample.entity.User;
import com.example.h2springdatajparestexample.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/users")
	public ResponseEntity<User> save(@RequestBody User user) {
		userRepository.save(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> findAll() {
		List<User> users = (List<User>) userRepository.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);

	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> findOne(@PathVariable long id) {
		User user = userRepository.findOne(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
}
