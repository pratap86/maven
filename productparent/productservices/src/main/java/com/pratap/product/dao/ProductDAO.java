package com.pratap.product.dao;

import com.pratap.product.dto.Product;
/**
 * 
 * @author 835698
 * Basic CRUD operations
 */
public interface ProductDAO {

	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
}
