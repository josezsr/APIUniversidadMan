package com.ibm.academia.restap.universidad.servicios;

 
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona> 
{
    public Optional<Persona> buscarPersonaNombreYApellido(String nombre,String Apellido);
	public Optional<Persona> buscarPorDni(String dni);
	public Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
