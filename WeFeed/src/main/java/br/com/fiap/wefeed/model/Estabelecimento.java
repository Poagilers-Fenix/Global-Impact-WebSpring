package br.com.fiap.wefeed.model;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Entity
public class Estabelecimento implements UserDetails {

	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Digite um nome.")
	@Size(min = 3, max = 40, message="O nome deve ter no mínimo 3 e máximo 40 caracteres")
	private String nome;
	
	@NotBlank(message="Digite um CNPJ")
	@Size(min = 14, max = 20, message="Digite no mínimo 14 e máximo 20 caracteres.")
	private String cnpj;
	
	@NotBlank(message="DIgite um telefone.")
	@Size(min= 8, message = "Insira um número de telefone válido. Ex. (XX) XXXX-XXXX")
	private String telefone;
	
	@NotBlank(message="Digite um e-mail.")
	@Email(message = "Insira um e-mail válido. Ex: user@gmail.com")
	private String email;
	
	
	@Size(min = 5, max = 1000, message="A senha deve ter no mínimo 5.")
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	
	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estabelecimento other = (Estabelecimento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	
}
