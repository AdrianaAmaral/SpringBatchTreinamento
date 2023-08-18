package com.projeto.springBatch.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empregado {

	@Id
	private Integer id;
	
	private String name;
	private Integer telefone;
	private String codDepartamento;
	private String nomeDepartamento;
	
	public Empregado() {
	}

	public Empregado(Integer id, String name, Integer telefone, String codDepartamento, String nomeDepartamento) {
		this.id = id;
		this.name = name;
		this.telefone = telefone;
		this.codDepartamento = codDepartamento;
		this.nomeDepartamento = nomeDepartamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	@Override
	public String toString() {
		return "Empregado [id=" + id + ", nome=" + name + ", telefone=" + telefone + ", codDepartamento=" + codDepartamento + ", nomeDepartamento=" + nomeDepartamento
				+ "]";
	}
	
}
