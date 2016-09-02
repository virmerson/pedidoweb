package br.com.fdp.pedidos.teste;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.fdp.pedidos.model.Order;
import br.com.fdp.pedidos.repository.OrderRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class OrderRepositoryTest {
	@Autowired
	private OrderRepository orderRepository;
	@Test
	public void save(){
		
		Order order = new Order();
		order.setValorTotal(new BigDecimal("13.00"));
		
	}

}
