package com.projeto.springBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.springBatch.entities.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Integer>{
	
}
