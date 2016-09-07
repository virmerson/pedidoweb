package br.com.fdp.pedidos.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String bairro;
	private String logradouro;
	private String cep;
	private String complemento;
	private Integer numero;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String bairro, String logradouro, String cep,
			String complemento, Integer numero) {
		super();
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	
	

}
