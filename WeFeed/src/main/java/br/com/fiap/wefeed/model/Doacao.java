package br.com.fiap.wefeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Doacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doacaoId;
	
	@NotBlank
	private Date dataDoacao;
	
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	@ManyToOne
	private Ong ong;
	
}
