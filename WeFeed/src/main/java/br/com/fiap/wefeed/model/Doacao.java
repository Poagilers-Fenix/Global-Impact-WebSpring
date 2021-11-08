package br.com.fiap.wefeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Doacao {

	private int doacaoId;
	
	private Date dataDoacao;
	
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	@ManyToOne
	private Ong ong;
	
}
