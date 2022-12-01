package com.main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.Exceptions.ProductNotFoundException;
import com.main.Models.Product;
import com.main.Repository.ProductRepository;

public class ProductDaoImpl implements ProductService{
	
	@Autowired
	private ProductRepository pRepo;

	@Override
	public Product addProduct(Product product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
		Product p = pRepo.save(product);
		
		if(p==null) {
			throw new ProductNotFoundException();
		}
		
		return p;
	}

	@Override
	public Product getProductById(Integer id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updatePorduct(Integer id, Product product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProductById(Integer id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
