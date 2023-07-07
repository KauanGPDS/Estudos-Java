package padrao.novoUsuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import padrao.usuario;

public class NovoProduto {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		usuario novoUsuario = new usuario("Kauan","Kauan@lanche.com.br");

		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("Novo Usuario : " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}
