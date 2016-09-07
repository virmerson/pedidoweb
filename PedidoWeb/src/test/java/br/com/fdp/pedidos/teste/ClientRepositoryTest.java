package br.com.fdp.pedidos.teste;

import br.com.fdp.pedidos.model.Address;
import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.repository.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

import java.util.Date;

/**
 * Created by guguh on 06/09/2016.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClientRepositoryTest {
    @Autowired
    ClientRepository clientRepository;

    @Test
    public void saveClient(){

        Client client = new Client("Gustavo", new Date(),"gugu@hotmail.com",
        "6666666", "88888888", new Address("teste","teste","teste","teste"));
        Client savedClient = clientRepository.save(client);

        assertThat(client.getNome()).isEqualTo(savedClient.getNome());
        assertThat(client.getEmail()).isEqualTo(savedClient.getEmail());
    }
}
