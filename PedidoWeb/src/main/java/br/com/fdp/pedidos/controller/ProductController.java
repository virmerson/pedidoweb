package br.com.fdp.pedidos.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fdp.pedidos.model.Product;
import br.com.fdp.pedidos.repository.ProductRepository;

@Named
@ViewScoped
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	private Product product = new Product();
	private List<Product> products;
	
	@PostConstruct
	public void init(){
		//PRODUCTS LIST FROM DATABASE
		products = productRepository.findAll();	
	}

	//GETTERS AND SETTERS
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	//CRUD
	public void save(){
		productRepository.save(product);
	}
	
	public void update(Product product){
		this.product = product;
	}
	
	public void delete(Product product){
		productRepository.delete(product);
	}
	
	public void list(){
		productRepository.findAll();
	}
	
	public void cancel(){
		product = new Product();
	}
}
