package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Product;
import br.com.fdp.pedidos.repository.ProductRepository;

@Named
@ViewScoped
public class ProductController {
	
	@Getter@Setter
	private Product product = new Product();
	@Getter@Setter
	private List<Product> products;
	@Autowired
	private ProductRepository productRepository;
	@Getter@Setter
	private boolean modoEdicao = false;
	@PostConstruct
	public void init(){
		
		products = productRepository.findAll();
		
	}
	public void save(){
		productRepository.save(getProduct());
		if(!isModoEdicao());
		products.add(product);
		product = new Product();
		setModoEdicao(false);
	}
	public void remove(Product product){
		productRepository.delete(product);
		products.remove(product);
		product = new Product();
	}
	public void editar(Product product){
		setProduct(product);
		setModoEdicao(true);
	}
	public void cancelar(){
		product = new Product();
		setModoEdicao(false);
	}

	
 
}
