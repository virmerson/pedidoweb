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
	
	
	private Product product = new Product();
	
	private List<Product> products;
	@Autowired
	private ProductRepository productRepository;
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
	public boolean isModoEdicao() {
		return modoEdicao;
	}
	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}
	
 
}
