package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

public interface EmpleadoDAO extends PersonaDAO
{
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);

}
