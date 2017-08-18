package com.example.h2springdatajpawebexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.h2springdatajpawebexample.entity.User;
import com.example.h2springdatajpawebexample.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/addUser")
	public String save(User user) {
		userRepository.save(user);
		return ("redirect:/listUsers");
	}

	@GetMapping("/addUser")
	public ModelAndView addNewEmployee() {
		User user = new User();
		return new ModelAndView("addUser", "form", user);

	}

	@GetMapping("/listUsers")
	public ModelAndView findAll() {
		List<User> users = (List<User>) userRepository.findAll();
		return new ModelAndView("listUsers", "users", users);

	}

}
