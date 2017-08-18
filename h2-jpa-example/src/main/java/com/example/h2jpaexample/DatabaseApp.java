package com.example.h2jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.h2jpaexample.dao.UserDaoService;
import com.example.h2jpaexample.entity.User;

@Component
public class DatabaseApp implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DatabaseApp.class);

	@Autowired
	private UserDaoService userDaoService;

	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jack", "Admin");
		long id = userDaoService.save(user);
		LOG.info("New user created: " + id);
	}

}
