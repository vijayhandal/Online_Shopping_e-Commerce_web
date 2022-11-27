package com.main.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class LoginDTO {

	@Email(message = "Please Enter valid Email")
	private String userId;
	@NotNull(message = "password not be null")
	@Size(min = 5 , message = "password minimum length is 5")
	private String password;
	@NotNull(message = "password not be null")
	private String userType;
}
