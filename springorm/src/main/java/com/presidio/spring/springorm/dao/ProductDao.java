package com.presidio.spring.springorm.dao;

import java.util.List;

import com.presidio.spring.springorm.entities.Product;

public interface ProductDao {

	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product findProductById(int id);
	
	List<Product> fetchAllProducts();
}
