package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;

@Primary
@NoRepositoryBean
public interface PersonaRepository extends CrudRepository<Persona, Long>
{
    @Query("select p from Persona p  where p.nombre= ?1 and p.apellido = ?2")
	public Optional<Persona> buscarPersonaNombreYApellido(String nombre,String apellido);
	
	@Query("select p from Persona p where p.dni=?1")
	public Optional<Persona>  buscarPorDni(String dni);
	
	@Query("select p from Persona p where p.apellido like %?1%")
	public Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
