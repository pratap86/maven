package com.pratap.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pratap.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {

		ProductDAO dao = new ProductDAOImpl();
		
		Product product = new Product();
		product.setId(101);
		product.setName("IPhone XR");
		product.setDescription("Its awesome");
		product.setPrice(67000);
		
		dao.create(product);
		Product result = dao.read(product.getId());
		
		assertNotNull(result);
		assertEquals(product.getName(), result.getName());
		
	}

}
