package com.example.reststarter;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.reststarter.entity.Post;
import com.example.reststarter.repository.PostRepository;

@SpringBootApplication
public class RestStarterApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestStarterApplication.class);

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestStarterApplication.class, args);
	}

	@PostConstruct
	void seePosts() {
		logger.info("seePosts method called...");
		for (Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}
	}
}
