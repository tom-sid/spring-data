package com.example.reststarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.reststarter.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
