 package com.ibm.academia.restap.universidad.repositorios;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Primary
@Repository("repositorioAlumno")
public interface AlumnoRepository extends PersonaRepository
{
    @Query("select a from Alumno a join fetch a.carrera c  where c.nombre = ?1")
	public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}
  