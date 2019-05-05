package com.radiantsage.service.product._1;

public class ProductServiceImpl implements ProductService {

	public Product registerProduct(Product product) {
		System.out.println("--- registerProduct ---");
		System.out.println("Product: " + product);
		return product;
	}

}
