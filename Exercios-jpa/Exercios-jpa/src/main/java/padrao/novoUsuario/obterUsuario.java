package padrao.novoUsuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import padrao.usuario;

public class obterUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		usuario u = em.find(usuario.class,7L);
		System.out.println(u.getNome());
		
		
		em.close();
		emf.close();
		
		
		
	}

}
