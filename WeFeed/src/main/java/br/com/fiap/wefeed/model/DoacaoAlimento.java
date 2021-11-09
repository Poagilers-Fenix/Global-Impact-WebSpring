package br.com.fiap.wefeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class DoacaoAlimento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doacaoId;
	
	private Date dataValidade;
	
	private String quantidade;
	
	private String foto;
	
	@Enumerated
	private Estado estado;
	
	@ManyToOne
	private Doacao doacao;
	
	@ManyToOne
	private Alimento alimento;
	
	
	
}
