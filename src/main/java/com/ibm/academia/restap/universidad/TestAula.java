package com.ibm.academia.restap.universidad;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;
import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.servicios.AulaDAO;
import com.ibm.academia.restap.universidad.servicios.PabellonDAO;

@Component
public class TestAula implements CommandLineRunner{

	/*@Autowired
	private PabellonDAO pabellonDao;
	*/
	@Autowired 
	@Qualifier("aulaDAOImpl")
	private AulaDAO aulaDao;
	
	@Override
	public void run(String... args) throws Exception
	{
		/*Aula aula1 = new Aula(null,6,"48.6",40,TipoPizarron.valueOf("PIZARRON_BLANCO"),"jose");
		aulaDao.guardar(aula1);
		System.out.println(aula1.toString());*/
		//1
		/*Iterable<Aula> aulas = aulaDao.findAulaByTipoPizarron(TipoPizarron.valueOf("PIZARRON_BLANCO"));
		System.out.println(aulas.toString());*/
		
		/*Optional<Pabellon> pabellon1 = pabellonDao.buscarPorId(2L);
		System.out.println(pabellon1.toString());
		
		Iterable<Aula> aula1 = aulaDao.buscarTodos();
		System.out.println(aula1.toString());
		
				/*alumnos.forEach(alumno -> {
					((Alumno)alumno).setCarrera(sistemas.get());
					personaDao.guardar(alumno);
				});*/
				
		/*aula1.forEach(aula -> ((Aula)aula).setPabellon(pabellon1.get()));
		aula1.forEach(aula -> aulaDao.guardar(aula));*/
		
	
		//3
		/*Iterable<Aula> aulas = aulaDao.findAulaByNumeroAula(3);
		System.out.println(aulas.toString());*/
		
	}

}
