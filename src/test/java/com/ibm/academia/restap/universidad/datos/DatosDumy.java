package com.ibm.academia.restap.universidad.datos;

import java.math.BigDecimal;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restap.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restap.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.modelo.entidades.Profesor;

public class DatosDumy {
	public static Carrera carrera01() 
	{
		return new Carrera(null, "Ingenieria en Sistemas", 50, 5, "nsegura"); 
	}

	public static Carrera carrera02() 
	{
		return new Carrera(null, "Licenciatura en Sistemas", 45, 4, "nsegura");
	}

	public static Carrera carrera03() 
	{
		return new Carrera(null, "Ingenieria Industrial", 60, 5, "nsegura");
	}
	
	public static Persona empleado01() 
	{
		return new Empleado(null, "Lautaro", "Lopez", "25147036", "nsegura", new Direccion(), new BigDecimal("46750"), TipoEmpleado.ADMINISTRATIVO);
	}
	
	public static Persona empleado02() 
	{
		return new Empleado(null, "Lenadro", "Lopez", "25174630", "nsegura", new Direccion(), new BigDecimal("46750.70"), TipoEmpleado.MANTENIMIENTO);
	}
	
	public static Persona profesor01()
	{
		return new Profesor(null, "Martin", "Axacar", "4477899", "nsegura", new Direccion(), new BigDecimal("600000"));
	}
	
	public static Persona alumno01()
	{
		return new Alumno(null, "Jhon", "Benitez", "4223715", "nsegura", new Direccion());
	}
	
	public static Persona alumno02() 
	{
		return new Alumno(null, "Andres", "Benitez", "45233891", "nsegura", new Direccion());
	}

	public static Persona alumno03() 
	{
		return new Alumno(null, "Joaquin", "Leon", "45233012", "nsegura", new Direccion());
	}
	
	public static Pabellon pabellon01() 
	{
		return new Pabellon(null,48.8,"IFQ4",new Direccion(),"jose");
	}
	
	public static Pabellon pabellon02() 
	{
		return new Pabellon(null,48.8,"IFQ1",new Direccion(),"jose");
	}
	
	public static Pabellon pabellon03() 
	{
		return new Pabellon(null,48.8,"CCO3",new Direccion(),"jose");
	}
	
	public static Aula Aula01() 
	{
		return new Aula(null,1,"14.5",14,TipoPizarron.PIZARRON_BLANCO,"jose");
	}
	
	public static Aula Aula02() 
	{
		return new Aula(null,2,"14.5",14,TipoPizarron.PIZARRON_TIZA,"jose");
	}
	
}
