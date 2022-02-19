package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.repositorios.EmpleadoRepository;
import com.ibm.academia.restap.universidad.repositorios.PersonaRepository;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO
{

	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleado")PersonaRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
		return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
		}

}
