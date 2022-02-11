package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;

@EnableJpaRepositories
@Repository("repositorioPabellon")
public interface PabellonRepository extends CrudRepository<Pabellon, Long>
{
	//@Query("insert Into pabellon(mtro)")
	public Iterable<Pabellon> findPabellonByNombreContains(String nombre);


}
