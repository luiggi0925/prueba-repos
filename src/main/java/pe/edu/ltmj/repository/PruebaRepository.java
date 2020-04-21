package pe.edu.ltmj.repository;

import java.util.List;

public interface PruebaRepository<T, E> {
	void save(T entity);
	T findOne(E index);
	void delete(E index);
	List<T> getAll();
}
