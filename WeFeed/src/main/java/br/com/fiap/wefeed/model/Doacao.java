package br.com.fiap.wefeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Doacao {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doacaoId;
	
	private Date dataDoacao;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Ong ong;
	
}
