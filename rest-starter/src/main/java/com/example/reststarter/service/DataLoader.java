package com.example.reststarter.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reststarter.entity.Author;
import com.example.reststarter.entity.Post;
import com.example.reststarter.repository.AuthorRepository;
import com.example.reststarter.repository.PostRepository;

@Service
public class DataLoader {
	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	private void loadData() {

		Author author = new Author("Donald", "Trump");
		authorRepository.save(author);
		
		Post post = new Post();
		post.setTitle("My Blog");
		post.setBody("Spring rocks!");
		post.setPostedOn(new Date());
		post.setAuthor(author);
		postRepository.save(post);
	}

}
