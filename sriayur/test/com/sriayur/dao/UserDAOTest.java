package com.sriayur.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.sriayur.entity.Users;

public class UserDAOTest {

	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setEmail("subbaeesan1@hotmail.com");
		user1.setFullName("Subbaeesan2");
		user1.setPassword("subbaeesan1");
		
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		UserDAO userDAO = new UserDAO(entityManager);
		user1 = userDAO.create(user1);
		
		
		
		
		entityManager.close();
		entityManagerFactory.close();
		
		assertTrue(user1.getUserId() > 0);
		
		
		
	}
	
	@Test
	public void testCreateUserFieldNotSet() {
		
	}

}
