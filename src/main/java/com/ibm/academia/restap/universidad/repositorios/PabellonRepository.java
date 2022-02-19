package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;

@Repository("repositorioPabellon")
public interface PabellonRepository extends CrudRepository<Pabellon, Long>
{
	public Iterable<Pabellon> findPabellonByNombre(String nombre);
	//public Iterable<Pabellon> findPabellonByLocalidad(String localidad);


}
