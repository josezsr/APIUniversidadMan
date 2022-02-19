package com.ibm.academia.restap.universidad.servicios;

import static com.ibm.academia.restap.universidad.datos.DatosDumy.Aula01;
import static com.ibm.academia.restap.universidad.datos.DatosDumy.Aula02;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;
import com.ibm.academia.restap.universidad.repositorios.AulaRepository;

@SpringBootTest
public class AulaDAOImplTest {

	@MockBean
	AulaDAO aulaDao;
	
	@Autowired
	AulaRepository aulaReposiotry;
	
	@Test
	@DisplayName("Test: busca por tipo de pizarron")
	void findAulaByTipoPizarron()
	{
		//when
		aulaDao.findAulaByTipoPizarron(TipoPizarron.valueOf("PIZARRON_BLANCO"));
		
		//than
		verify(aulaReposiotry).findAulaByTipoPizarron(TipoPizarron.valueOf("PIZARRON_BLANCO"));

	}
	

	@Test
	@Disabled
	@DisplayName("Test: busca numero de aulas")
	void findAulaByNumeroAula()
	{
		
		//when
	//	List<Aula> expected = (List<Aula>) ((AulaRepository)aulaRepository).findAulaByNumeroAula(2);
		
		//than
		//assertThat(expected.size() == 1).isTrue(); 
	}
}
