package br.com.fiap.wefeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class DoacaoAlimento {

	private int doacaoId;
	
	private Date dataValidade;
	
	private String quantidade;
	
	private String foto;
	
	@OneToOne
	private Estado estado;
	
	@ManyToOne
	private Doacao doacao;
	
	@ManyToOne
	private Alimento alimento;
	
	
	
}
