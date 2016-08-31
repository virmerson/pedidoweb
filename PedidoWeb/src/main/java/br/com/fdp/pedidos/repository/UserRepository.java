package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
