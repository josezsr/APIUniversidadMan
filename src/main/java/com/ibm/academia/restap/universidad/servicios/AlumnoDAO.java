package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO
{
	
	public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);

}
