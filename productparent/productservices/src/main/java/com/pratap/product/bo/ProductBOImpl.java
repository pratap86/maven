package com.pratap.product.bo;

import com.pratap.product.dao.ProductDAO;
import com.pratap.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDAO dao;
	
	@Override
	public void create(Product product) {

		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
