package com.main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	@Size(min = 2,max = 10, message = "Name Should be length between 3 to 10")
	private String Name;
	@Email
	private String email;
	@NotNull
	private String password;
	@Size(min = 10,max = 10, message = "phone number should be contain only 10")
	private String phone;
	@NotNull
	private String address;
}
