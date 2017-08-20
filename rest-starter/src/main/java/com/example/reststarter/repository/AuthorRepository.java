package com.example.reststarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.reststarter.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
