package com.java.turnosrotativos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity(name = "conceptos")
public class Concepto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String nombre;

	@Column
	private Boolean laborable;

	@JsonInclude(JsonInclude.Include.NON_NULL) // SI EL VALOR ES NULO NO MUESTRA EL CAMPO.
	@Column
	private Integer hsMinimo;

	@JsonInclude(JsonInclude.Include.NON_NULL) // SI EL VALOR ES NULO NO MUESTRA EL CAMPO.
	@Column
	private Integer hsMaximo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getLaborable() {
		return laborable;
	}

	public void setLaborable(Boolean laborable) {
		this.laborable = laborable;
	}

	public Integer getHsMinimo() {
		return hsMinimo;
	}

	public void setHsMinimo(Integer hsMinimo) {
		this.hsMinimo = hsMinimo;
	}

	public Integer getHsMaximo() {
		return hsMaximo;
	}

	public void setHsMaximo(Integer hsMaximo) {
		this.hsMaximo = hsMaximo;
	}
}
