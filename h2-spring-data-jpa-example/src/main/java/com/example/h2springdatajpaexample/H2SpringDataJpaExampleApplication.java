package com.example.h2springdatajpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.h2springdatajpaexample.entity.User;
import com.example.h2springdatajpaexample.repository.UserRepository;

@SpringBootApplication
public class H2SpringDataJpaExampleApplication {
	
	private static final Logger log = LoggerFactory.getLogger(H2SpringDataJpaExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(H2SpringDataJpaExampleApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of users
			repository.save(new User("Jack", "Admin"));
			repository.save(new User("Chloe", "Guest"));
			repository.save(new User("Kim", "Manager"));
			repository.save(new User("David", "Guest"));
			repository.save(new User("Michelle", "Manager"));

			// fetch all users
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			User user = repository.findOne(3L);
			log.info("User found with findOne(3L):");
			log.info("--------------------------------");
			log.info(user.toString());
			log.info("");

			// fetch customers by last name
			log.info("User found with findByRole('Guest'):");
			log.info("--------------------------------------------");
			for (User u : repository.findByRole("Guest")) {
				log.info(u.toString());
			}
			log.info("");
		};
	}
}
