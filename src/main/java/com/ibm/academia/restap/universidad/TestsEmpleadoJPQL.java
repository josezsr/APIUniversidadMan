package com.ibm.academia.restap.universidad;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EnumType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.servicios.EmpleadoDAO;
import com.ibm.academia.restap.universidad.servicios.PersonaDAO;



@Component
public class TestsEmpleadoJPQL  implements CommandLineRunner{
	
	
	
	@Autowired
	@Qualifier("empleadoDAOImpl")
	private PersonaDAO personaDao;

	private EmpleadoDAO empleadoDao;
	
	BigDecimal bd = new BigDecimal(14000);
	
	@Override
	public void run(String... args) throws Exception 
	{  
		
		
		/*Direccion direccionEmpelado = new Direccion("siega","276a","417a","454157a","137wa","puebla3");
		Persona empleado = new Empleado(null, "marta", "guerr", "1238191", "jose7", direccionEmpelado,bd,TipoEmpleado.valueOf("ADMINISTRATIVO"));
		Persona personaEmpleado = personaDao.guardar(empleado);
		System.out.println(personaEmpleado.toString());*/
		
		/*Iterable<Persona> alumnosCarrera = ((EmpleadoDAO)personaDao).findEmpleadoByTipoEmpleado(TipoEmpleado.valueOf("MANTENIMIENTO"));
		alumnosCarrera.forEach(System.out::println);*/
	}

	
}
