package br.com.treinaweb.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	
	private static EntityManagerFactory emf = null;

	public static EntityManager getEntityManager() {
		if(emf == null) {
			emf= Persistence.createEntityManagerFactory("treinawb-jpa-fundamentos");
		}
		return emf.createEntityManager();
	}
}
