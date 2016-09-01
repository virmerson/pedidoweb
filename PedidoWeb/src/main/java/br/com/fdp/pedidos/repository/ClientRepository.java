package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
