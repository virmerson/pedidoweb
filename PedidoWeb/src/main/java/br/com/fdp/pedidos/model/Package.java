package br.com.fdp.pedidos.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="tb_package")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Package {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private BigDecimal valorPackage;
	

}
