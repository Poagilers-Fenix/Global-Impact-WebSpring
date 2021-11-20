package br.com.fiap.wefeed.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Doacao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Estabelecimento estab;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Ong ong;
	
}