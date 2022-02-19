package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.restap.universidad.repositorios.PersonaRepository;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO 
{
	@Autowired
	public ProfesorDAOImpl(@Qualifier(("repositorioProfesor"))PersonaRepository repository) {
		super(repository);
	}

	
	



	
}
