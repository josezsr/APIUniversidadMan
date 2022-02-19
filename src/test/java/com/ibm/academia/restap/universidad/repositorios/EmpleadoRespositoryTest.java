package com.ibm.academia.restap.universidad.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import static com.ibm.academia.restap.universidad.datos.DatosDumy.empleado01;
import static com.ibm.academia.restap.universidad.datos.DatosDumy.empleado02;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restap.universidad.datos.DatosDumy;
import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;


@DataJpaTest
public class EmpleadoRespositoryTest
{

	@Autowired
	@Qualifier("repositorioEmpleado")
	private PersonaRepository empleadoRepository;
	
	@BeforeEach
	void setUp()
	{
		//given
		empleadoRepository.save(DatosDumy.empleado01());
		empleadoRepository.save(DatosDumy.empleado02());
	}
	
	@AfterEach
	void tearDown() { EmpleadoRepository empleadoRepository;  }
    
	@Test  
	@DisplayName("Test: buscar empleado por tipo de empleado")
	void findEmpleadoByTipoEmpleado() {
		
		//when
		List<Persona> expected = (List<Persona>) ((EmpleadoRepository)empleadoRepository).findEmpleadoByTipoEmpleado(TipoEmpleado.valueOf("MANTENIMIENTO"));
		
		
		//than
		assertThat(expected.size() == 1).isTrue(); 

	}
}
