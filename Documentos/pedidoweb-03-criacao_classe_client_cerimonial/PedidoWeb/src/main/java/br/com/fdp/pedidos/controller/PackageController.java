package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Package;
import br.com.fdp.pedidos.repository.PackageRepository;

@Named
@ViewScoped
public class PackageController {

	private Package embrulho = new Package();

	private List<Package> embrulhos;

	@Autowired
	private PackageRepository embrulhoRepository;
	
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {

		embrulhos = embrulhoRepository.findAll();
		
	}

	public void save() {
		embrulhoRepository.save(getEmbrulho());
		if (!isModoEdicao())
			embrulhos.add(embrulho);
		embrulho = new Package();
		setModoEdicao(false);
	}
	public void remove(Package embrulho){
		embrulhoRepository.delete(embrulho);
		embrulhos.remove(embrulho);
		embrulho = new Package();
	}
	public void editar(Package embrulho){
		setEmbrulho(embrulho);
		setModoEdicao(true);
		
	}
	public void cancelar(){
		embrulho = new Package();
		setModoEdicao(false);
	}

	public Package getEmbrulho() {
		return embrulho;
	}

	public void setEmbrulho(Package embrulho) {
		this.embrulho = embrulho;
	}

	public List<Package> getEmbrulhos() {
		return embrulhos;
	}

	public void setEmbrulhos(List<Package> embrulhos) {
		this.embrulhos = embrulhos;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}
	

}
