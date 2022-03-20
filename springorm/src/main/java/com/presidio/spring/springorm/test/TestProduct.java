package com.presidio.spring.springorm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.presidio.spring.springorm.dao.ProductDao;
import com.presidio.spring.springorm.entities.Product;

public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springorm/test/productJdbcConfig.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao"); //name is given inside component annotation
		
//		Product product = new Product();
//		product.setId(1002);
//		product.setName("Lenovo Laptop");
//		product.setPrice(500.0d);
//		product.setDescription("Lenovo Laptop is Awesome Product");
//		
		
		// Create Product
		// productDao.create(product);
		
		// Update Product
		// productDao.update(product);
		
		// Delete Product
		// It selects first and then delete the product
		// productDao.delete(product);
		
		// get Single Product
//		Product product = productDao.findProductById(1000);
//		System.out.println(product);
		
		// get all products list
		List<Product> products = productDao.fetchAllProducts();
		for(Product p : products) {
			System.out.println(p);
		}
	}
}
