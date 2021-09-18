package com.sriayur.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sriayur.entity.Users;

public class UserDAOTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	
	@BeforeClass
	public static void setupClass() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		userDAO = new UserDAO(entityManager);
	}
	
	
	
	

	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setEmail("subbaeesan11@hotmail.com");
		user1.setFullName("Subbaeesan11");
		user1.setPassword("subbaeesan11");
		
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		UserDAO userDAO = new UserDAO(entityManager);
		user1 = userDAO.create(user1);
		
		
		
		
		entityManager.close();
		entityManagerFactory.close();
		
		assertTrue(user1.getUserId() > 0);
		
		
		
	}
	
	@Test(expected=PersistenceException.class)
	public void testCreateUserFieldNotSet() {
		Users user1 = new Users();
				
	
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		UserDAO userDAO = new UserDAO(entityManager);
		user1 = userDAO.create(user1);
		
		
		
		
		//entityManager.close();
		//entityManagerFactory.close();
		
		assertTrue(user1.getUserId() > 0);
		
	}
	
	
	@AfterClass
	public static void tearDownClass() {
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
