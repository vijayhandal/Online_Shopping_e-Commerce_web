package com.main.Services;

import java.util.List;

import com.main.Exceptions.ProductNotFoundException;
import com.main.Models.Product;

public interface ProductService {

	public Product addProduct(Product product) throws ProductNotFoundException;
	
	public Product getProductById(Integer id) throws ProductNotFoundException;
	
	public List<Product> getAllProducts()throws ProductNotFoundException;
	
	public Product updatePorduct(Integer id, Product product) throws ProductNotFoundException;
	
	public Product deleteProductById(Integer id)throws ProductNotFoundException;
	
}
