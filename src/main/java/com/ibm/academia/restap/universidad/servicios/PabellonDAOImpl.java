package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.repositorios.PabellonRepository;


@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO
{
	@Autowired
	public PabellonDAOImpl(@Qualifier(("repositorioPabellon"))PabellonRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> findPabellonByNombre(String nombre) {
		
		return repository.findPabellonByNombre(nombre);
	}

	/*/@Override
	@Transactional(readOnly = true)
	public Iterable<Pabellon> findPabellonByLocalidad(String localidad) {
		return null;
	}*/


	



	
}
