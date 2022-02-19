package com.ibm.academia.restap.universidad.modelo.entidades;

import java.math.BigDecimal;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.ibm.academia.restap.universidad.enumeradores.TipoEmpleado;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="empleados",schema="universidad")
@PrimaryKeyJoinColumn(name="persona_id")
public class Empleado extends Persona
{
	@Column(name="sueldo")
	private BigDecimal sueldo;
	
	@Column(name="tipo_empleado")
	@Enumerated(EnumType.STRING)
	private TipoEmpleado tipoEmpleado;
	
	@OneToOne(optional = true, cascade= CascadeType.ALL)
	@JoinColumn(name="pabellon_id", foreignKey=@ForeignKey(name="FK_PABELLON_ID"))
	private Pabellon pabellon;
	
	public Empleado(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion,BigDecimal sueldo,TipoEmpleado tipoEmpelado) {
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
		this.sueldo = sueldo;
		this.tipoEmpleado=tipoEmpelado;
	}

	

	public Empleado() {
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Empleado [sueldo=");
		builder.append(sueldo);
		builder.append(", tipoEmpleado=");
		builder.append(tipoEmpleado);
		builder.append("]");
		return builder.toString();
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}


	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}


	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}


	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}



	private static final long serialVersionUID = -9150775959023226424L;


}
