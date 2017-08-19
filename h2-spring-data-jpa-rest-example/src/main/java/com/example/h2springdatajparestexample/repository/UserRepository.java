package com.example.h2springdatajparestexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.h2springdatajparestexample.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
