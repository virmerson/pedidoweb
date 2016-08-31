package br.com.fdp.pedidos.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_package")
public class Package {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private BigDecimal valorPackage;
	
	public Package() {
		// TODO Auto-generated constructor stub
	}

	public Package(Long id, String descricao, BigDecimal valorPackage) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorPackage = valorPackage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorPackage() {
		return valorPackage;
	}

	public void setValorPackage(BigDecimal valorPackage) {
		this.valorPackage = valorPackage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((valorPackage == null) ? 0 : valorPackage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Package other = (Package) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valorPackage == null) {
			if (other.valorPackage != null)
				return false;
		} else if (!valorPackage.equals(other.valorPackage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Package [id=" + id + ", descricao=" + descricao
				+ ", valorPackage=" + valorPackage + "]";
	}
	
}
