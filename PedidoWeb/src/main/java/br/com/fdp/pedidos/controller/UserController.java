package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.User;
import br.com.fdp.pedidos.repository.UserRepository;

@Named
@ViewScoped
public class UserController {

	private User user = new User();

	private List<User> users;
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {
		users = userRepository.findAll();
	}

	public void salvar() {

		userRepository.save(getUser());
		users.add(user);
		user = new User();

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
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
