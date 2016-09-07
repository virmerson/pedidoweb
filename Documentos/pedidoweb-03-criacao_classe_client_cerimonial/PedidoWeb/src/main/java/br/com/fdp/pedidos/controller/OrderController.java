package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Order;
import br.com.fdp.pedidos.model.Ceremonial;
import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.model.Order;
import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.CeremonialRepository;
import br.com.fdp.pedidos.repository.ClientRepository;
import br.com.fdp.pedidos.repository.OrderRepository;
import br.com.fdp.pedidos.repository.StateRepository;

@Named
@ViewScoped
public class OrderController {

	private Order order = new Order();

	private List<Order> orders;
	
	private List<Client> clients;
	
	private List<Ceremonial> ceremonials;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CeremonialRepository ceremonialRepository;
	
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {

		orders = orderRepository.findAll();
		clients = clientRepository.findAll();
		ceremonials = ceremonialRepository.findAll();
		
	}

	public void save() {
		orderRepository.save(getOrder());
		if (!isModoEdicao())
			orders.add(order);
		order = new Order();
		setModoEdicao(false);
	}
	public void remove(Order order){
		orderRepository.delete(order);
		orders.remove(order);
		order = new Order();
	}
	public void editar(Order order){
		setOrder(order);
		setModoEdicao(true);
		
	}
	public void cancelar(){
		order = new Order();
		setModoEdicao(false);
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Ceremonial> getCeremonials() {
		return ceremonials;
	}

	public void setCeremonials(List<Ceremonial> ceremonials) {
		this.ceremonials = ceremonials;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}




	

}
