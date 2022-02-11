package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.repositorios.AlumnoRepository;
import com.ibm.academia.restap.universidad.repositorios.PersonaRepository;
import java.util.Optional;


@Service

public class AlumnoDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements  AlumnoDAO 
{
		
	@Autowired
	public  AlumnoDAOImpl(@Qualifier("repositorioAlumno")PersonaRepository repository)
	{
		super(repository);
	}

    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera)
    {
		return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombreCarrera);
    }

     
    
    @Override
    public Optional<Persona> buscarPersonaNombreYApellido(String nombre, String Apellido)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Persona> buscarPorDni(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	
}
