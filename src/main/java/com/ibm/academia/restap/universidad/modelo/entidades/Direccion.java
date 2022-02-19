package com.ibm.academia.restap.universidad.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Direccion implements Serializable
{
	



	private String calle;
	private String numero;
	private String codigPostal;
	private String departamento;
	private String piso;
	private String localidad;

	

	public Direccion(String calle, String numero, String codigPostal, String departamento, String piso,	String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.codigPostal = codigPostal;
		this.departamento = departamento;
		this.piso = piso;
		this.localidad = localidad;
	}


	public Direccion() {
		
	}
	



	private static final long serialVersionUID = 3725007133066185991L;

}
