package com.ibm.academia.restap.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.servicios.PabellonDAO;

public class TestPabellon implements CommandLineRunner 
{
	@Autowired
	private PabellonDAO pabellonDao;
	
	@Override
	public void run(String... args) throws Exception
	{
		
		Direccion direccionPabellon= new Direccion("calle nueva","24","27760","S/n","s/N","puebla");
		Pabellon pabellon1 = new Pabellon(null,48.5,"IFQ1",direccionPabellon,"jose");
		
		pabellonDao.guardar(pabellon1);

		
		
		
	}

}
