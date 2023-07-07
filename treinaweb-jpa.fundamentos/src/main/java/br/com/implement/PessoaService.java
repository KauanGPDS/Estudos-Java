package br.com.implement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.interfaces.ICRUD;
import br.com.modelJpa.Pessoa;
import br.com.treinaweb.jpa.JpaUtils;

public class PessoaService implements ICRUD<Pessoa, Long> {

	@Override
	public List<Pessoa> all() {
		List<Pessoa> pessoas = new ArrayList<>();
		EntityManager em = null;
				try {
					em = JpaUtils.getEntityManager();
					pessoas = em.createQuery("from Pessoa",Pessoa.class).getResultList();
					return pessoas;
				} catch (Exception e) {
					
				}finally {
					if(em != null) {
						em.close();
					}
					
				}
		return pessoas;
	}

	@Override
	public Pessoa byId(Long id) {
		return null;
	}

	@Override
	public Pessoa insert(Pessoa entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa update(Pessoa entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pessoa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNyId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
