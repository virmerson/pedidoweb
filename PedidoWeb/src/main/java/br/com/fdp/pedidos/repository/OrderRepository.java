package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
