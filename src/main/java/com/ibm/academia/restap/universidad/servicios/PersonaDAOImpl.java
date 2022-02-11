package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

import com.ibm.academia.restap.universidad.repositorios.PersonaRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements PersonaDAO

{

    public PersonaDAOImpl(@Qualifier("repositorioPersona")PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Persona> buscarPersonaNombreYApellido(String nombre, String Apellido) {
		return repository.buscarPersonaNombreYApellido(nombre,Apellido);
    }

    @Override
    public Optional<Persona> buscarPorDni(String dni) {
		return repository.buscarPorDni(dni);
    }

    @Override
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
		return repository.buscarPersonaPorApellido(apellido);
    }
    
}
