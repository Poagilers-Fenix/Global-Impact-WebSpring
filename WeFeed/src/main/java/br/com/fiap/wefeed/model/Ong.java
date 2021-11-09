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
public class Ong {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ongId;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String telefone;
	
	@OneToOne
	private Endereco endereco;
	
}
