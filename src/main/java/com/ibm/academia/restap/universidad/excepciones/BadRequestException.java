package com.ibm.academia.restap.universidad.excepciones;

public class BadRequestException extends RuntimeException
{

	public BadRequestException(String mensaje)
	{
		super(mensaje);
	}
	private static final long serialVersionUID = 7899722960310931439L;

}
