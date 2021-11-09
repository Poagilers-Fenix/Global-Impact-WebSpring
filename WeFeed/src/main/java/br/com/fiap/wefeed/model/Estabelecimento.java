package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int estabelecimentoId;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String cnpj;
	
	@NotBlank
	private String telefone;
	
	@NotBlank
	private String email;
	
	@OneToOne
	private Endereco endereco;
	
}
