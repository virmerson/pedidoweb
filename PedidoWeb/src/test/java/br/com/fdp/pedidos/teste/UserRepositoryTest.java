package br.com.fdp.pedidos.teste;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.fdp.pedidos.model.User;
import br.com.fdp.pedidos.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepostory;

	@Test
	public void saveUser() {

		User user = new User();
		user.setLogin("Jao");
		user.setSenha("1234");
		user.setAtivo(true);

		User savedUser = userRepostory.save(user);

		assertThat(savedUser.getLogin()).isEqualTo(savedUser.getLogin());
		assertThat(savedUser.getSenha()).isEqualTo(savedUser.getSenha());
	}

}

