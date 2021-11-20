package br.com.fiap.wefeed.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Ong {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Digite um nome.")
	@Size(min = 5, max = 100, message="O nome deve ter o intervalo de 5 até 100 caracteres.")
	private String nome;
	
	@NotBlank(message= "Digite um telefone. Ex.(XX) XXXX-XXXX")
	private String telefone;
	
	@NotBlank(message= "Digite uma descrição no mínimo 10 caracteres.")
	@Size(min = 10, max = 1000)
	private String descricao;
	
	@NotBlank(message= "Informe um link de uma foto.")
	@Size(max = 1000)
	private String foto;
	
	@NotBlank(message="Informe um e-mail")
	@Email(message = "Insira um e-mail válido. Ex: user@gmail.com")
	private String email;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;
	
	
	
	

	
	
	
}
