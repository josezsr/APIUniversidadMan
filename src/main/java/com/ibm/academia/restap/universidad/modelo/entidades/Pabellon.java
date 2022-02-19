package com.ibm.academia.restap.universidad.modelo.entidades;
import java.io.Serializable;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
//@Table(name="pabellones", schema="universidad")
@Table(name="pabellones")

public class Pabellon implements Serializable  
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="metro_cuadrados")
	private Double metrosCuadrados;
	
	@Column(name="nombre" , nullable=false, length=60)
	private String nombre;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="codigoPostal",column=@Column(name="codido_postal")),
		@AttributeOverride(name="departamento", column=@Column(name="departamento"))
	})
	private Direccion direcion;
	
	@Column(name="usuario_creacion", nullable=false)
	private String usuarioCreacion;
	
	@Column(name="fecha_creacion", nullable=false)
	private Date fechaCreacion;
	
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	@OneToMany(mappedBy="pabellon",fetch=FetchType.LAZY)
	private Set<Aula> aulas;
	
	
	public Pabellon(Long id, Double metrosCuadrados, String nombre, Direccion direcion, String usuarioCreacion) {
		
		this.id = id;
		this.metrosCuadrados = metrosCuadrados;
		this.nombre = nombre;
		this.direcion = direcion;
		this.usuarioCreacion = usuarioCreacion;
	}


	public Pabellon() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pabellon [id=");
		builder.append(id);
		builder.append(", metrosCuadrados=");
		builder.append(metrosCuadrados);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direcion=");
		builder.append(direcion);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pabellon))
			return false;
		Pabellon other = (Pabellon) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
	

	@PrePersist
	private void antesPersistir()
	{
		this.fechaCreacion = new Date();
	}
	
	@PreUpdate
	private void antesActualizar ()
	{
		 this.fechaModificacion = new Date();
	}
	
	


	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}



	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Direccion getDirecion() {
		return direcion;
	}



	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}



	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}



	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public Set<Aula> getAulas() {
		return aulas;
	}



	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}





	private static final long serialVersionUID = -787944031745852662L;

}
