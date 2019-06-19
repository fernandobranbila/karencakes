package com.karencakes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingrediente {
	
	@Id
	private Long idIngrediente;
	
	private String nomeIngrediente;
	
	private double valorIngrediente;

	public Long getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public double getValorIngrediente() {
		return valorIngrediente;
	}

	public void setValorIngrediente(double valorIngrediente) {
		this.valorIngrediente = valorIngrediente;
	}
}
