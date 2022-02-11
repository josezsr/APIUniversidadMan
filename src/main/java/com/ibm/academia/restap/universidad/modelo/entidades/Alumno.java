package com.ibm.academia.restap.universidad.modelo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 	

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity

@Table(name="alumnos",schema="universidad")
@PrimaryKeyJoinColumn(name="persona_id")
public class Alumno extends Persona
{

	@ManyToOne(optional=true , cascade= {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.LAZY)
	@JoinColumn(name="carrera_id",foreignKey=@ForeignKey(name="FK_CARRERA_ID"))
	private Carrera carrera;
	
	public Alumno(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion) {
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
	}


	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Alumno []");
		return builder.toString();
	}
	private static final long serialVersionUID = -8620759536738977352L;

}
