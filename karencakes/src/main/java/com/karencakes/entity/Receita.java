package com.karencakes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Receita {
	
	@Id
	private Long receitaId;
	
	private double valorTotalReceita;
	
	@OneToMany(mappedBy="ingrediente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Ingrediente> listaIngredientes;

	public double getValorTotalReceita(List<Ingrediente> listaIngredientes) {
		return listaIngredientes.stream()
				.mapToDouble(ingrediente -> ingrediente.getValorIngrediente())
				.sum();
	}

}
