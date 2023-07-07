package padrao.novoUsuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import padrao.usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from usuario u";
		TypedQuery<usuario> query = em.createQuery(jpql,usuario.class);
		query.setMaxResults(5);
		
		List<usuario> usuarios = query.getResultList();
		
		for(usuario usuari : usuarios) {
			System.out.println("ID: " + usuari.getId() + "\nEmail: " + usuari.getEmail());
		}
		
		em.close();
		emf.close();
	}

}
