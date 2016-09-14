package br.com.fdp.pedidos.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_state")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {
	@Id
	@GeneratedValue
	private Long id;
	private String uf;


}
