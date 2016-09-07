package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
