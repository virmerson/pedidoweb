package br.com.fdp.pedidos.teste;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.fdp.pedidos.repository.ClientRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClientRepositoryTest {
	
	@Autowired
	private ClientRepository clientRepository;
	@Test
	public void save(){
		
	}
	
	

}
