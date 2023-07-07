package padrao.novoUsuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import padrao.usuario;

public class obterUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		

		em.getTransaction().begin();
		
		usuario u = em.find(usuario.class, 6L);
		
		u.setEmail("Fabraz@Lanche.com.br");
		
//		em.merge(u);
		System.out.println(u.getEmail());
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
