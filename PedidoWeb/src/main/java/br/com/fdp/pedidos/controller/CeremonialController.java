package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Ceremonial;
import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.CeremonialRepository;
import br.com.fdp.pedidos.repository.StateRepository;

@Named
@ViewScoped
public class CeremonialController {

	private Ceremonial ceremonial = new Ceremonial();

	private List<Ceremonial> ceremonials;

	@Autowired
	private CeremonialRepository ceremonialRepository;
	
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {

		ceremonials = ceremonialRepository.findAll();
		
	}

	public void save() {
		ceremonialRepository.save(getCeremonial());
		if (!isModoEdicao())
			ceremonials.add(ceremonial);
		ceremonial = new Ceremonial();
		setModoEdicao(false);
	}
	public void remove(Ceremonial ceremonial){
		ceremonialRepository.delete(ceremonial);
		ceremonials.remove(ceremonial);
		ceremonial = new Ceremonial();
	}
	public void editar(Ceremonial ceremonial){
		setCeremonial(ceremonial);
		setModoEdicao(true);
		
	}
	public void cancelar(){
		ceremonial = new Ceremonial();
		setModoEdicao(false);
	}
	public Ceremonial getCeremonial() {
		return ceremonial;
	}

	public void setCeremonial(Ceremonial ceremonial) {
		this.ceremonial = ceremonial;
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
