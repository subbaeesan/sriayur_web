package sriayur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sriayur.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users user1 = new Users();
		user1.setEmail("subbaeesan@hotmail.com");
		user1.setFullName("Subbaeesan");
		user1.setPassword("subbaeesan");
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		
		System.out.println("A users object was persisted");
		
		
		
		

	}

}
