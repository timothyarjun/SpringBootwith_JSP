package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Product;
import com.spring.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product getOne(Long id) {
		return repo.findById(id).get();
	}
	
	public Product update(Product product) {
		return repo.saveAndFlush(product);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Product> searchProduct(String search){
		return repo.searchProduct(search);
	}
	
	public List<Product> priceShow(Long price){
		return repo.priceShow(price);
		
	}
		
}
