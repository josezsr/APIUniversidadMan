package com.ibm.academia.restap.universidad;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ibm.academia.restap.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restap.universidad.servicios.CarreraDAO;
import com.ibm.academia.restap.universidad.servicios.PersonaDAO;


@Primary
@Component
public class TestAlumnoJPQL implements CommandLineRunner
{
	@Autowired
	private CarreraDAO carreraDao;
	
	@Autowired
	@Qualifier("alumnoDAOImpl")
	private PersonaDAO personaDao;

	@Override
	public void run(String... args) throws Exception 
	{
		/*Optional<Carrera> sistemas = carreraDao.buscarPorId(7L);
		
		Iterable<Persona> alumnos = personaDao.buscarTodos();
		System.out.println(personaDao.buscarTodos());*/
		
				/*alumnos.forEach(alumno -> {
					((Alumno)alumno).setCarrera(sistemas.get());
					personaDao.guardar(alumno);
				});*/
				
				/*alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(sistemas.get()));
				alumnos.forEach(alumno -> personaDao.guardar(alumno));*/
				
				/*Optional<Persona> alumnoUno = personaDao.buscarPorId(16L);
				/*Optional<Persona> personaNombreApellido = personaDao.buscarPersonaNombreYApellido(alumnoUno.get().getNombre(), alumnoUno.get().getApellido());
				System.out.println(personaNombreApellido);*/
				/*
				Optional<Persona> personaDni = personaDao.buscarPorDni(alumnoUno.get().getDni());
		        System.out.println(personaDni.toString());*/
		        
		      /*  Iterable<Persona> personasApellido = personaDao.buscarPersonaPorApellido(alumnoUno.get().getApellido());
		        personasApellido.forEach(System.out::println);*/
				
				/*Optional<Carrera> sistemas = carreraDao.buscarPorId(10L);
				Iterable<Persona> alumnosCarrera = ((AlumnoDAO)personaDao).buscarAlumnosPorNombreCarrera(sistemas.get().getNombre());
				alumnosCarrera.forEach(System.out::println);*/
	}

}
