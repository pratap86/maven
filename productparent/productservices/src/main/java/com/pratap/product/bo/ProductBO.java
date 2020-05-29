package com.pratap.product.bo;

import com.pratap.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
}
