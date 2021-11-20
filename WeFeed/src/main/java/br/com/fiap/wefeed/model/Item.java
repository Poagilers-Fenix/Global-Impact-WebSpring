package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Item {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Digite um nome.")
	@Size(max = 100, message="O nome deve ter no máximo 100 caracteres.")
	private String nome;
	
	private String foto;
	
}
