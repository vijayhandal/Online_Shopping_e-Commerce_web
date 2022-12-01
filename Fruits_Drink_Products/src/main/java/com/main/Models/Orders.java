package com.main.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private String description;
	private LocalDateTime orderDate;
	private Double totalOrderAmount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	@OneToMany
	private List<Product> products = new ArrayList<>();

	public Orders(Customer customer) {

		double sum = 0.0;
		
		for(Product p:customer.getCart().getProductList()) {
			sum += p.getPrice()*p.getQuantity();
		}
		
		this.totalOrderAmount = sum;
	}

}
