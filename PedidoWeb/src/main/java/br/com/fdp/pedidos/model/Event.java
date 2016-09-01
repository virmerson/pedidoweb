package br.com.fdp.pedidos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_event")
public class Event {
	@Id
	@GeneratedValue
	private Long id;

}
