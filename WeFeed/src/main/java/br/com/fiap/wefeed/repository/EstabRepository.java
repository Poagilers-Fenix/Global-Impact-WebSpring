package br.com.fiap.wefeed.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.wefeed.model.Estabelecimento;

public interface EstabRepository extends JpaRepository<Estabelecimento, Long>{
	
	Optional<Estabelecimento> findByEmail(String username);

}


