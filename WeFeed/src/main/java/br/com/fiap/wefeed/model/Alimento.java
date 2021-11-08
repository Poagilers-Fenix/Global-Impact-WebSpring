package br.com.fiap.wefeed.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Alimento {

	private int alimentoId;
	
	private String nome;
	
}
