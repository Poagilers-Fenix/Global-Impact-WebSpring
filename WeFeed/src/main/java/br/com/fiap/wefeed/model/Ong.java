package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Ong {

	private int ongId;
	
	private String nome;
	
	private String telefone;
	
	@OneToOne
	private Endereco endereco;
	
}
