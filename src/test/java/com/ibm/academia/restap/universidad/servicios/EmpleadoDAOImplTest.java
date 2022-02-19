package com.ibm.academia.restap.universidad.servicios;


import static com.ibm.academia.restap.universidad.datos.DatosDumy.carrera01;
import static com.ibm.academia.restap.universidad.datos.DatosDumy.carrera03;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.repositorios.EmpleadoRepository;

@SpringBootTest
public class EmpleadoDAOImplTest {
	
	
	@MockBean
	 EmpleadoRepository empleadoRespository;
	
	@Autowired
	private EmpleadoDAO empleadoDao;
	
	
	@Test  
	@DisplayName("Test: buscar empleado por tipo de empleado")
	void findEmpleadoByTipoEmpleado() {
		
		
		//when
		empleadoDao.findEmpleadoByTipoEmpleado(TipoEmpleado.valueOf("MANTENIMIENTO"));
		
		//than
		verify(empleadoRespository).findEmpleadoByTipoEmpleado(TipoEmpleado.valueOf("MANTENIMIENTO"));

	}
	
	
}
