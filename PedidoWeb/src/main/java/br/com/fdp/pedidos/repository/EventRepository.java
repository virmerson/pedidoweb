package br.com.fdp.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdp.pedidos.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
