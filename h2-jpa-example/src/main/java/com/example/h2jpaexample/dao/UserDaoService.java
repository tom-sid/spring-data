package com.example.h2jpaexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
