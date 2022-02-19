package com.ibm.academia.restap.universidad.servicios;
import static com.ibm.academia.restap.universidad.datos.DatosDumy.carrera01;
import static com.ibm.academia.restap.universidad.datos.DatosDumy.carrera03;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ibm.academia.restap.universidad.datos.DatosDumy;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.repositorios.CarreraRepository;

public class CarreraDAOImplTest {
	
	
	//mockito
	CarreraDAO carreraDao;
	CarreraRepository carreraRepository;
	
	@BeforeEach
	void setUp()
	{
		carreraRepository = mock(CarreraRepository.class);
		carreraDao = new CarreraDAOImpl(carreraRepository);
	}
	
	
	

	@Test 
	@DisplayName("Test: busca carreras por nombre")
   void findCarrerasByNombreContains() 
   {
		//Given
		String nombreCarrera = "Ingenieria";
		when(carreraRepository.findCarrerasByNombreContains(nombreCarrera))
			.thenReturn(Arrays.asList(carrera01(), carrera03()));
		//When
				List<Carrera> expected = (List<Carrera>) carreraDao.findCarrerasByNombreContains(nombreCarrera);
				
				//Then
				assertThat(expected.get(0)).isEqualTo(carrera01());
				assertThat(expected.get(1)).isEqualTo(carrera03());
				
				verify(carreraRepository).findCarrerasByNombreContains(nombreCarrera);
   }
	 
	@Test 
	
	@DisplayName("Test: busca carreras por nombre no case sensitive")
    void findCarrerasByNombreContainsIgnoreCase() 
    {
		//Given
				String nombreCarrera = "Ingenieria";
				when(carreraRepository.findCarrerasByNombreContainsIgnoreCase(nombreCarrera))
					.thenReturn(Arrays.asList(carrera01(), carrera03()));
				//When
						List<Carrera> expected = (List<Carrera>) carreraDao.findCarrerasByNombreContainsIgnoreCase(nombreCarrera);
						
						//Then
						assertThat(expected.get(0)).isEqualTo(carrera01());
						assertThat(expected.get(1)).isEqualTo(carrera03());
						
						verify(carreraRepository).findCarrerasByNombreContainsIgnoreCase(nombreCarrera);
    }
	
	
	@Test
	@DisplayName("Test: busca carrerasmayores a N años")
	   void findCarrerasByCantidadAniosAfter() 
	   {
		//Given
			Integer canitdad=4;
			when(carreraRepository.findCarrerasByCantidadAniosAfter(canitdad))
					.thenReturn(Arrays.asList(carrera01(), carrera03()));
				//When
						List<Carrera> expected = (List<Carrera>) carreraDao.findCarrerasByCantidadAniosAfter(canitdad);
						
						//Then
						assertThat(expected.get(0)).isEqualTo(carrera01());
						assertThat(expected.get(1)).isEqualTo(carrera03());
						
						verify(carreraRepository).findCarrerasByCantidadAniosAfter(canitdad);
	   }
	    
}
