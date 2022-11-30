//package com.main.Models;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Data
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Order {
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer orderid;
//	private String description;
//	private LocalDateTime orderDate;
//	private Double totalOrderAmount;
//	
//	
//	
////	@OneToMany
////	private List<Product> products = new ArrayList<>();
////
////	public Order(Customer customer) {
////
////		double sum = 0.0;
////		
////		for(Product p:customer.getCart().getProductList()) {
////			sum += p.getPrice()*p.getQuantity();
////		}
////		
////		this.totalOrderAmount = sum;
////	}
//	
//	
//	
//	
//
//}
