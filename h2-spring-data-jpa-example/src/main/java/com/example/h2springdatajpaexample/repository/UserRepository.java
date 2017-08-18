package com.example.h2springdatajpaexample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.h2springdatajpaexample.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public List<User> findByRole(String role);
}
