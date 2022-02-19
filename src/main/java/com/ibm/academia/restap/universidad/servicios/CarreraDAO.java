package com.ibm.academia.restap.universidad.servicios;

import javax.validation.Valid;

import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;

public interface CarreraDAO extends GenericoDAO<Carrera>
{
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
	public Carrera actualizar(Long carreraId, @Valid Carrera carrera);
	

}
