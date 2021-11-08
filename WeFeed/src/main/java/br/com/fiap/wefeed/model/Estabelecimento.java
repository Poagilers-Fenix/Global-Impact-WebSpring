package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Estabelecimento {

	private int estabelecimentoId;
	
	private String nome;
	
	private String cnpj;
	
	private String telefone;
	
	private String email;
	
	@OneToOne
	private Endereco endereco;
	
}
