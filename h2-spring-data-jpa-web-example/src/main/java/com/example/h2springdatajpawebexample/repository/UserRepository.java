package com.example.h2springdatajpawebexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.h2springdatajpawebexample.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
