package com.br.projetoPI2018.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	@GeneratedValue
	private int id;
	private String cep;
	private String logradouro;
	private String rua;
	private String numeroCasa;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private List Pessoal;
	
	public Endereco() {
		
	}
	public Endereco(int id, String cep, String logradouro, String rua, String numeroCasa, String bairro, String cidade,
			String estado, String pais, List pessoal) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		Pessoal = pessoal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public List getPessoal() {
		return Pessoal;
	}
	public void setPessoal(List pessoal) {
		Pessoal = pessoal;
	}
	
	
}
