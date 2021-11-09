package br.com.fiap.wefeed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Alimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int alimentoId;
	
	@NotBlank
	private String nome;
	
}
