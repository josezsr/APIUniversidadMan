package com.ibm.academia.restap.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.servicios.PabellonDAO;


@Component
public class TestPabellon implements CommandLineRunner 
{

	
	@Autowired
	private PabellonDAO pabellonDao;
	
	@Override
	public void run(String... args) throws Exception
	{
		
		/*Direccion direccionPabellon= new Direccion("calle nueva1","24711","1277601","171","711","puebla1");
		Pabellon pabellon1 = new Pabellon(null,148.5,"CC03",direccionPabellon,"jose");
		pabellonDao.guardar(pabellon1);
		System.out.println(pabellon1.toString());*/

		/*Iterable<Pabellon> pabellones = pabellonDao.findPabellonByNombre("IFQ1");
		System.out.println(pabellones.toString());*/
		
	/*	Iterable<Pabellon> pabellones = pabellonDao.findPabellonByLocalidad("puebla1");
		System.out.println(pabellones.toString());*/
		
	}

}
