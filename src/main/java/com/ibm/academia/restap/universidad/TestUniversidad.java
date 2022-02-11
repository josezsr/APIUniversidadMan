package com.ibm.academia.restap.universidad;

/*
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/*
import com.ibm.academia.restap.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restap.universidad.servicios.CarreraDAO;
*/

@Component
public class TestUniversidad implements CommandLineRunner

{/*


	@Autowired
	private CarreraDAO carreraDao;
	
	@Autowired
	private AlumnoDAO alumnoDao;*/
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		/*Carrera ingenieriaSistemas = new Carrera(null, "sistemas", 60, 5, "nsegura");
		Carrera carrera = carreraDao.guardar(ingenieriaSistemas);
		System.out.println(carrera.toString());*/
		/*
		Direccion direccionAlumno = new Direccion("siega","276","417","4541575","123f17w","puebla3");
		Persona alumno = new Alumno(null, "Pepito", "Perez", "12345189", "nsegura7", direccionAlumno);
		Persona personaAlumno = alumnoDao.guardar(alumno);
		System.out.println(personaAlumno.toString());*/
		
		/*//TODO CCONSULTA
		List<Persona> alumnos = (List<Persona>)alumnoDao.buscarTodos();
		alumnos.forEach(System.out::println);
		/*
		Carrera carrera2 = new Carrera(null, "calculo integral", 40, 5, "nsegura2");
                Carrera carrera = carreraDao.guardar(carrera2);
                System.out.println(carrera.toString());

        
		Carrera carrera = null;
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(11L);
		
		if(oCarrera.isPresent())
		{
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
		}
		else
		{
			System.out.println("Carrera no se encuentra");
		}
		
		//TODO UPDATE
		
		carrera.setCantidadAnios(6);
		carrera.setCantidadMaterias(7);
		carreraDao.guardar(carrera);
		
		System.out.println("Carrera Actualizada: " + carreraDao.buscarPorId(1L).orElse(new Carrera()).toString());
		
		//TODO UPDATE
		/*
		carreraDao.eliminarPorId(2L);
		System.out.println("Eliminado");*/
	}
}