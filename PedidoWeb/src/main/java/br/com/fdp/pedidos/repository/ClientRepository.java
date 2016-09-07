package br.com.fdp.pedidos.repository;

import br.com.fdp.pedidos.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by guguh on 06/09/2016.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
