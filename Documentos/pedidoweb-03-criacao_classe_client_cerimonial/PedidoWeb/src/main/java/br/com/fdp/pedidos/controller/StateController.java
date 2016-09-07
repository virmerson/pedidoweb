package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.StateRepository;

@Named
@ViewScoped
public class StateController {
	
	private State state = new State();
	
	private List<State> states;
	@Autowired
	private StateRepository stateRepository;
	
	private boolean modoEdicao = false;
	
	@PostConstruct
	public void init(){
		states = stateRepository.findAll();
	}
	
	public void save(){
		
	 stateRepository.save(getState());
		if(!isModoEdicao())
			states.add(state);
		state = new State();
		setModoEdicao(false);
	}
	
	public void remove(State state){
		stateRepository.delete(state);
		states.remove(state);
		state = new State();
		
	}
	public void editar(State state){
		setState(state);
		setModoEdicao(true);
	}
	public void cancelar(){
		state = new State();
		setModoEdicao(false);
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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
