package com.ibm.academia.restap.universidad.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restap.universidad.datos.DatosDumy;
import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;

@DataJpaTest
public class AulaRespositoryTest
{
	@Autowired
	@Qualifier("repositorioAula")
	private AulaRepository aulaRepository;
	
	@BeforeEach
	void setUp()
	{
		//given
		aulaRepository.save(DatosDumy.Aula01());
		aulaRepository.save(DatosDumy.Aula02());
	}
	
	@AfterEach
	void tearDown() { EmpleadoRepository empleadoRepository;  }
	
	@Test
	@DisplayName("Test: busca por tipo de pizarron")
	void findAulaByTipoPizarron()
	{
		//when
		List<Aula> expected = (List<Aula>) ((AulaRepository)aulaRepository).findAulaByTipoPizarron(TipoPizarron.valueOf("PIZARRON_BLANCO"));
		//than
		assertThat(expected.size() == 1).isTrue(); 

	}
	

	@Test
	@DisplayName("Test: busca numero de aulas")
	void findAulaByNumeroAula()
	{
		
		//when
		List<Aula> expected = (List<Aula>) ((AulaRepository)aulaRepository).findAulaByNumeroAula(2);
		
		//than
		assertThat(expected.size() == 1).isTrue(); 
	}
}
