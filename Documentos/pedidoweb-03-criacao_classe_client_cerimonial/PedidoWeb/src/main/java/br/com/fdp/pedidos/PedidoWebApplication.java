package br.com.fdp.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PedidoWebApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PedidoWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidoWebApplication.class, args);
	}
}
