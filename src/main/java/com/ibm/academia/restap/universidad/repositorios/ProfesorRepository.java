
package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository
{
	/*@Query("select a from Profesor_carrera  c.nombre like %?1%\"" )
	public Iterable<Persona> findProfesoresByCarrera(String Carrera);*/
}
