package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String nome;
	
	private String cnpj;
	
	private String telefone;
	
	@Email(message="Insira um e-mail válido. Ex: google@gmail.com")
	private String email;
	
	@OneToOne
	private Endereco endereco;
	
	private String password;

	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}

	
	
}
