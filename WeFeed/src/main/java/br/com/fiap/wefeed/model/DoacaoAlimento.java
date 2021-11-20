package br.com.fiap.wefeed.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class DoacaoAlimento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotBlank(message="Informe uma quantidade.")
	private String quantidade;
	
	private String foto;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Doacao doacao;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Item item;
	
	
	
}
