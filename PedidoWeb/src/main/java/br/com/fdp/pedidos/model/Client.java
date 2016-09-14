package br.com.fdp.pedidos.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tb_client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String email;
	private String telefone;
	private String cpf;
	private String nomeNoivo;
	@ManyToOne
	@JoinColumn(nullable=false)
	private State state;
	@Embedded
	private Address addres;

}