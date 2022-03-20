package com.presidio.spring.springorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.presidio.spring.springorm.dao.ProductDao;
import com.presidio.spring.springorm.entities.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		int savedProducts = (int) hibernateTemplate.save(product);
		return savedProducts;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product findProductById(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	@Transactional
	public List<Product> fetchAllProducts() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

}
