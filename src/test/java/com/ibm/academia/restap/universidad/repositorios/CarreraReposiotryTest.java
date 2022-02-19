package com.ibm.academia.restap.universidad.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.academia.restap.universidad.datos.DatosDumy;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.repositorios.CarreraRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CarreraReposiotryTest {
///junit
	@Autowired
	private CarreraRepository carreraRepository;
	
	@BeforeEach
	void setUp()
	{
		//given
		carreraRepository.save(DatosDumy.carrera01());
		carreraRepository.save(DatosDumy.carrera02());
		carreraRepository.save(DatosDumy.carrera03());
	}
	
	@AfterEach
	void tearDown() { CarreraRepository carreraRepository; }
	
	
	
	@Test 
	@DisplayName("Test: busca carreras por nombre")
   void findCarrerasByNombreContains() 
   {
		//given
		/*carreraRepository.save(DatosDumy.carrera01());
		carreraRepository.save(DatosDumy.carrera02());
		carreraRepository.save(DatosDumy.carrera03());*/
		
		//when
		List<Carrera> expected = (List<Carrera>)carreraRepository.findCarrerasByNombreContains("Industrial");
		
		//than
		assertThat(expected.size() ==1 ).isTrue(); 
   }
	 
	@Test 
	@DisplayName("Test: busca carreras por nombre no case sensitive")
    void findCarrerasByNombreContainsIgnoreCase() 
    {
		//given
		/*carreraRepository.save(DatosDumy.carrera01());
		carreraRepository.save(DatosDumy.carrera02());
		carreraRepository.save(DatosDumy.carrera03());*/
		
		//when
		List<Carrera> expected = (List<Carrera>)carreraRepository.findCarrerasByNombreContainsIgnoreCase("sistemas");
		
		//than
		assertThat(expected.size() ==2 ).isTrue(); 
    }
	
	@Test
	@DisplayName("Test: busca carrerasmayores a N años")
	   void findCarrerasByCantidadAniosAfter() 
	   {
		//given
				/*carreraRepository.save(DatosDumy.carrera01());
				carreraRepository.save(DatosDumy.carrera02());
				carreraRepository.save(DatosDumy.carrera03());*/
				//when
				List<Carrera> expected = (List<Carrera>)carreraRepository.findCarrerasByCantidadAniosAfter(4);
				
				//than
				assertThat(expected.size() == 2).isTrue(); 
	   }
	    
}
