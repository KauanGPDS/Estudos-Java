package br.com.interfaces;

import java.util.List;

public interface ICRUD<T,K> {

	List<T>all();
	T byId(K id);
	T insert(T entity);
	T update(T entity);
	void delete(T entity);
	void deleteNyId(K id);
	
}
