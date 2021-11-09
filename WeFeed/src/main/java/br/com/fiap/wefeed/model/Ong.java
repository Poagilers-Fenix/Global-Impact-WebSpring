package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Ong {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ongId;
	
	private String nome;
	
	private String telefone;
	
	@OneToOne
	private Endereco endereco;
	
}
