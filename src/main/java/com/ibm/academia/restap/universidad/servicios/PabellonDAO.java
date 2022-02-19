package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
	
	public Iterable<Pabellon> findPabellonByNombre(String nombre);
//	public Iterable<Pabellon> findPabellonByLocalidad(String localidad);

	
	}
	
