package br.com.fdp.pedidos.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ceremonial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ceremonial {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String telefone;

	
}
