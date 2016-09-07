package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.ClientRepository;
import br.com.fdp.pedidos.repository.StateRepository;

@Named
@ViewScoped
public class ClientController {

	private Client client = new Client();

	private List<Client> clients;

	private List<State> states;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private StateRepository stateRepository;
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
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}

}
