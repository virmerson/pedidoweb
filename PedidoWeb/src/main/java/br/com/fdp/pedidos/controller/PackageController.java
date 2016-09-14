package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Package;
import br.com.fdp.pedidos.model.Product;
import br.com.fdp.pedidos.repository.PackageRepository;

@Named
@ViewScoped
public class PackageController {
	@Getter@Setter
	private Package embrulho = new Package();
	@Getter@Setter
	private List<Package> embrulhos;

	@Autowired
	private PackageRepository embrulhoRepository;
	@Getter@Setter
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

	
}
