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

	
	public Direccion(String string, String string2, String string3, String string4, String string5, String string6) {
	}


	public Direccion() {
	}


	private static final long serialVersionUID = 3725007133066185991L;

}
