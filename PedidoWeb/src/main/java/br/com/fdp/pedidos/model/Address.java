package br.com.fdp.pedidos.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String bairro;
	private String lagradouro;
	private String cep;
	private String complemento;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String bairro, String lagradouro, String cep,
			String complemento) {
		super();
		this.bairro = bairro;
		this.lagradouro = lagradouro;
		this.cep = cep;
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLagradouro() {
		return lagradouro;
	}

	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
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
	
	

}
