import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sriayur.entity.Category;


public class CategoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category newCat = new Category("Beans");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sriayur");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(newCat);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		
		System.out.println("A users object was persisted");
		
		
	}

}
