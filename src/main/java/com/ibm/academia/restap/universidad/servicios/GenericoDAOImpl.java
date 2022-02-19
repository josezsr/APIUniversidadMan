package com.ibm.academia.restap.universidad.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GenericoDAOImpl<E, R extends CrudRepository<E, Long>> implements GenericoDAO<E>
{

 	protected final R repository;
 	
 	public GenericoDAOImpl(@Qualifier("repositorioAlumno")R repository)
 	{
 		this.repository = repository;
 	}
 	
 	
	public void user() {
	}


	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Long id)
	{
		return repository.findById(id);
	}  

	@Override
	@Transactional
	public E guardar(E entidad) {
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() {
		return repository.findAll();
	}

	@Override
	@Transactional 
	public void eliminarPorId(Long id) {
		repository.deleteById(id);
	}
	


}
