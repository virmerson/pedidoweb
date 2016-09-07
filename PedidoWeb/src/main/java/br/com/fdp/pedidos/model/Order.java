package br.com.fdp.pedidos.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_order")
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(nullable=false)
	private Client client;
	@Temporal(TemporalType.DATE)
	private Date dataPedido;
	@Temporal(TemporalType.DATE)
	private Date dataEntrega;
	@Embedded
	private Address enderecoEntrega;
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorTotal;
	@ManyToOne
	@JoinColumn(nullable=false)
	private Ceremonial ceremonial;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, Client client, Date dataPedido, Date dataEntrega,
			Address enderecoEntrega, BigDecimal valorTotal,
			Ceremonial ceremonial) {
		this.client = client;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.enderecoEntrega = enderecoEntrega;
		this.valorTotal = valorTotal;
		this.ceremonial = ceremonial;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public Address getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Address enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Ceremonial getCeremonial() {
		return ceremonial;
	}
	public void setCeremonial(Ceremonial ceremonial) {
		this.ceremonial = ceremonial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ceremonial == null) ? 0 : ceremonial.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result
				+ ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
		result = prime * result
				+ ((dataPedido == null) ? 0 : dataPedido.hashCode());
		result = prime * result
				+ ((enderecoEntrega == null) ? 0 : enderecoEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		Order other = (Order) obj;
		if (ceremonial == null) {
			if (other.ceremonial != null)
				return false;
		} else if (!ceremonial.equals(other.ceremonial))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (dataEntrega == null) {
			if (other.dataEntrega != null)
				return false;
		} else if (!dataEntrega.equals(other.dataEntrega))
			return false;
		if (dataPedido == null) {
			if (other.dataPedido != null)
				return false;
		} else if (!dataPedido.equals(other.dataPedido))
			return false;
		if (enderecoEntrega == null) {
			if (other.enderecoEntrega != null)
				return false;
		} else if (!enderecoEntrega.equals(other.enderecoEntrega))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", client.xhtml=" + client + ", dataPedido="
				+ dataPedido + ", dataEntrega=" + dataEntrega
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal="
				+ valorTotal + ", ceremonial=" + ceremonial + "]";
	}
	
	

}
