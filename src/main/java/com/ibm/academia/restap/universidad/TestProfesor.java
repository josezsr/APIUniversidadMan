package com.ibm.academia.restap.universidad;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.modelo.entidades.Profesor;
import com.ibm.academia.restap.universidad.servicios.PersonaDAO;

@Component
public class TestProfesor implements  CommandLineRunner {

	/*@Autowired
	@Qualifier("profesorDAOImpl")
	private PersonaDAO personaDao;
	
	BigDecimal bd = new BigDecimal(28000);*/

	@Override
	public void run(String... args) throws Exception
	{
		
		
		/*Direccion direccionEmpelado = new Direccion("siega","276","417a","454157a","137wa","puebla3");
		Persona profesor1 = new Profesor(null, "marta", "guerraz", "1235a819", "jose7", direccionEmpelado,bd);
		Persona personaProfesor = personaDao.guardar(profesor1);
		System.out.println(personaProfesor.toString());*/
		
	}

}
