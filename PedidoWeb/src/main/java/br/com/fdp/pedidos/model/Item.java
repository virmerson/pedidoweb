package br.com.fdp.pedidos.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(nullable=false)
	private Product product;
	@ManyToOne
	@JoinColumn(nullable=false)
	private Order order;
	private long quantidade;
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorUnitario;
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorTotal;
	
	

}
