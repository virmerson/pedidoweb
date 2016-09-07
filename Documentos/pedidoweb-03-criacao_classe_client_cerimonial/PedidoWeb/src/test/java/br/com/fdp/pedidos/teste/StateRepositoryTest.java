package br.com.fdp.pedidos.teste;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.StateRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class StateRepositoryTest {
	@Autowired
	private StateRepository stateRepository;
	
	@Test
	public void save(){
		
		State state = new State();
		state.setUf("DF");
		
		State stateSalvo = stateRepository.save(state);
		
		assertThat(stateSalvo.getUf());
		
	}

}
