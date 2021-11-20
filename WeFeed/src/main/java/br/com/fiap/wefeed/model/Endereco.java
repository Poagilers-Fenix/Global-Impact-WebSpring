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
public class Endereco {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Digite um CEP.")
	@Size(min = 9, max = 9, message = "Exemplo: XXXXX-XXX")
	private String cep;
	
	@NotBlank(message="Informe o nome do bairro.")
	@Size(min = 3, max = 30, message="O novo do bairro deve estar no intervalo de 3 à 30")
	private String bairro;
	
	@NotBlank(message="Informe o nome da cidade.")
	@Size(min = 3, max = 30, message="o nome da cidade deve estar no intervalo de 3 à 30")
	private String cidade;
	
	@NotBlank(message="Informe o UF.")
	@Size(min = 2, max = 2, message="O UF deve ter 2 caracteres")
	private String uf;
	
	@NotBlank(message="Informe o logradouro.")
	@Size(min = 5, max = 100, message="O logradouro deve estar no intervalo de 5 à 100")
	private String logradouro;
	
	@NotBlank(message="Informe o número")
	@Size(min = 1, max = 10, message="O número deve estar no intervalo de 1 à 10")
	private String numero;
	
	@Size(max = 100, message="O complemento deve ter no máximo 100 caracteres.")
	private String complemento;
	
	
}
