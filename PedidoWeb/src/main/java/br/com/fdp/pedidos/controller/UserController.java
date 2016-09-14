package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;





import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Product;
import br.com.fdp.pedidos.model.User;
import br.com.fdp.pedidos.repository.UserRepository;

@Named
@ViewScoped

public class UserController {
	@Getter@Setter
	private User user = new User();
	@Getter@Setter
	private List<User> users;
	@Autowired
	private UserRepository userRepository;
	@Getter@Setter
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {
		users = userRepository.findAll();
	}

	public void salvar() {

		userRepository.save(getUser());
		if (!isModoEdicao())
			users.add(user);
		user = new User();
		setModoEdicao(false);

	}

	public void limpar() {
		user = new User();
	}

	public void listar() {
		userRepository.findAll();
	}

	public void excluir(User user) {
		userRepository.delete(user);
		users.remove(user);
		user = new User();
	}

	public void editar(User user) {
		setUser(user);
		setModoEdicao(true);
	}

	public void cancelar() {
		user = new User();
		setModoEdicao(false);
	}


}
