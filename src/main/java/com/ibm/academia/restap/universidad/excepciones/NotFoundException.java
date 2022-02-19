package com.ibm.academia.restap.universidad.excepciones;

public class NotFoundException  extends RuntimeException{

	public NotFoundException(String mensaje)
	{
		super(mensaje);
	}
	private static final long serialVersionUID = -1164138071616171947L;

}
