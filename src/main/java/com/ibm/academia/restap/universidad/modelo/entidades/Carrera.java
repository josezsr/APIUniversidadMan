package com.ibm.academia.restap.universidad.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="carreras", schema="universidad")
public class Carrera implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty
	@Column(name ="nombre",nullable=false,unique= true, length= 80)
	private String nombre;
	
	@Positive(message = "El valor debe ser mayor a cero")
	@Column(name = "cantidad_materias")
	private Integer cantidadMaterias;
	
	@Column(name = "cantidad_anios")
	private Integer cantidadAnios;
	
	@NotNull
	@NotEmpty
	@Column(name="usuario_creacion",nullable=false)
	private String usuarioCreacion;
	
	@Column(name="fecha_creacion",nullable=false)
	private Date fechaCreacion;
	
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;
	
	@OneToMany(mappedBy="carrera",fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"carrera"})
	private Set<Alumno> alumnos;
	
	@ManyToMany(mappedBy="carreras",fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"carreras"})
	private Set<Profesor> profesores;
	



	public Carrera(Long id, String nombre, Integer cantidadMaterias, Integer cantidadAnios, String usuarioCreacion) {

		this.id = id;
		this.nombre = nombre;
		this.cantidadMaterias = cantidadMaterias;
		this.cantidadAnios = cantidadAnios;
		this.usuarioCreacion = usuarioCreacion;
	}

	public Carrera() {

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carrera [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", cantidadMaterias=");
		builder.append(cantidadMaterias);
		builder.append(", cantidadAnios=");
		builder.append(cantidadAnios);
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
		if (!(obj instanceof Carrera))
			return false;
		Carrera other = (Carrera) obj;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(Integer cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	public Integer getCantidadAnios() {
		return cantidadAnios;
	}

	public void setCantidadAnios(Integer cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}




	private static final long serialVersionUID = 8385885092001156491L;




	public static Carrera guardar(@Valid Carrera carrera) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
