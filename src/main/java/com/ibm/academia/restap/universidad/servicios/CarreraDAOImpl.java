package com.ibm.academia.restap.universidad.servicios;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restap.universidad.excepciones.NotFoundException;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.repositorios.CarreraRepository;

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO
{
	
	@Autowired
	public CarreraDAOImpl(@Qualifier("respositorioCarrera")CarreraRepository repository) {
		super(repository);
	}
	
    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
		return repository.findCarrerasByNombreContains(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
		return repository.findCarrerasByNombreContainsIgnoreCase(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios) {
		return repository.findCarrerasByCantidadAniosAfter(cantidadAnios);
    }

	@Override
	public Carrera actualizar(Long carreraId, @Valid Carrera carrera) {
		Optional<Carrera> oCarrera = repository.findById(carreraId);
		
		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con ID %d no existe", carreraId)); 
		
		Carrera carreraActualizada = null;
		oCarrera.get().setCantidadAnios(carrera.getCantidadAnios());
		oCarrera.get().setCantidadMaterias(carrera.getCantidadMaterias());
		carreraActualizada = repository.save(oCarrera.get());
		return carreraActualizada;
	}
	
}
