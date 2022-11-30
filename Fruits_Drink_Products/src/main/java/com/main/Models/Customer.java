package com.main.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Size(min = 2,max = 10, message = "Name Should be length between 3 to 10")
	private String Name;
	@Email
	private String email;
	@Size(min = 10,max = 10, message = "phone number should be contain only 10")
	private String phone;
	@NotNull
	private String address;
//	
//	@JsonIgnore
//	@OneToOne
//	private Cart cart;
//	
//	@JsonIgnore
//	@OneToMany()
//	private List<Order> orders = new ArrayList<>();
	
	
}
