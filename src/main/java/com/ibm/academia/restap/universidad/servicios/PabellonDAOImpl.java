package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.repositorios.PabellonRepository;


@Service

public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO
{
	@Autowired
	public PabellonDAOImpl(@Qualifier("repositorioPabellion")PabellonRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Pabellon> findPabellonByNombreContains(String nombre) 
	{
		return repository.findPabellonByNombreContains(nombre);
	}

	
}
