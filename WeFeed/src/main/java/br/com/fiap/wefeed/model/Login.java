package br.com.fiap.wefeed.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Login {
	
	@NotBlank
	@Email
	private String username;
	
	@NotBlank
	private String password;

	public Object getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
