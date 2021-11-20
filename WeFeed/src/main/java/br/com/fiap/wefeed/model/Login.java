package br.com.fiap.wefeed.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Login {
	
	@NotBlank(message="Digite seu e-mail.")
	@Email(message="Digite um e-mail válido.")
	private String username;
	
	@NotBlank(message="Digite sua senha.")
	private String password;

	public Object getUsername() {
		return username;
	}

	public Object getPassword() {
		return null;
	}

}
