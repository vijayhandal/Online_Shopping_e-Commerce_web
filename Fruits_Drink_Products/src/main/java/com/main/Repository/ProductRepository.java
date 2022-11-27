package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.Models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
