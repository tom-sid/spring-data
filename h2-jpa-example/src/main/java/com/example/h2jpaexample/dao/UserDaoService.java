package com.example.h2jpaexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.h2jpaexample.entity.User;

@Repository
@Transactional
public class UserDaoService {
	@PersistenceContext
	private EntityManager entityManager;

	public long save(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
