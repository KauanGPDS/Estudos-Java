package padrao.novoUsuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import padrao.usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		usuario u = em.find(usuario.class, 6L);
		
		if(u != null) {
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
	}
}
