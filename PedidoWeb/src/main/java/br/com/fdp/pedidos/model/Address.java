package br.com.fdp.pedidos.model;


import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private String bairro;
	private String logradouro;
	private String cep;
	private String complemento;
	private Integer numero;
	
	
	
	

}
