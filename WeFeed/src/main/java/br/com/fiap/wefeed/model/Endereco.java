package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Endereco {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enderecoId;
	
	@Size(min = 9, max = 9, message = "Exemplo: XXXXX-XXX")
	private String cep;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
		
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	
}
