package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.ClientRepository;
import br.com.fdp.pedidos.repository.StateRepository;

@Named
@ViewScoped
public class ClientController {
	@Getter@Setter
	private Client client = new Client();
	@Getter@Setter
	private List<Client> clients;
	@Getter@Setter
	private List<State> states;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private StateRepository stateRepository;
	@Getter@Setter
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {

		clients = clientRepository.findAll();
		states = stateRepository.findAll();

	}

	public void save() {
		clientRepository.save(getClient());
		if (!isModoEdicao())
			clients.add(client);
		client = new Client();
		setModoEdicao(false);
	}
	public void remove(Client client){
		clientRepository.delete(client);
		clients.remove(client);
		client = new Client();
	}
	public void editar(Client client){
		setClient(client);
		setModoEdicao(true);
	}
	public void cancelar(){
		client = new Client();
		setModoEdicao(false);
	}


}
