package com.karencakes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karencakes.entity.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {
	
}