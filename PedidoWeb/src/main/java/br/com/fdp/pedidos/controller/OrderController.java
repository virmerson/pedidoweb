package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

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
	@Getter@Setter
	private Order order = new Order();
	@Getter@Setter
	private List<Order> orders;
	@Getter@Setter
	private List<Client> clients;
	@Getter@Setter
	private List<Ceremonial> ceremonials;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CeremonialRepository ceremonialRepository;
	@Getter@Setter
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


	

}
