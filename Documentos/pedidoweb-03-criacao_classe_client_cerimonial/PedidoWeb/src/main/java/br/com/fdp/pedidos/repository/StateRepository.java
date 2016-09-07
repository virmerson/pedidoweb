package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fdp.pedidos.model.State;
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	

}
