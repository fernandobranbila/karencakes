package com.karencakes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karencakes.entity.Ingrediente;
import com.karencakes.entity.Receita;
import com.karencakes.repository.ReceitaRepository;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRepository receitaRepository;
	
}
