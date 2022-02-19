package com.ibm.academia.restap.universidad.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restap.universidad.datos.DatosDumy;
import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;


@DataJpaTest
public class PabellonRespositoryTest
{
	private PabellonRepository pabellonRepository;
	
	@BeforeEach
	void setUp()
	{
		//given
		pabellonRepository.save(DatosDumy.pabellon01());
		pabellonRepository.save(DatosDumy.pabellon02());
		pabellonRepository.save(DatosDumy.pabellon03());
	}
	
	@AfterEach
	void tearDown() { PabellonRepository pabellonRepository; }
	
	@Test 
	@DisplayName("Test: busca carreras por nombre")
	void findPabellonByNombre()
	{
		//when
		List<Pabellon> expected = (List<Pabellon>)pabellonRepository.findPabellonByNombre("CCO3");
		//than
		assertThat(expected.size() == 1 ).isTrue(); 
	}

}
