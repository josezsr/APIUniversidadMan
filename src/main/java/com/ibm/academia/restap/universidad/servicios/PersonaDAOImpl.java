package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

import com.ibm.academia.restap.universidad.repositorios.PersonaRepository;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements PersonaDAO

{

    public PersonaDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    
	@Override
	public Optional<Persona> buscarPersonaNombreYApellido(String nombre, String Apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

 
    

}
