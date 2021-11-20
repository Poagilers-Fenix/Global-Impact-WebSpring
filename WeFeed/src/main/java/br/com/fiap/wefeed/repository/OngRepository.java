package br.com.fiap.wefeed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.wefeed.model.Ong;

public interface OngRepository extends JpaRepository<Ong, Long>{

	List<Ong> findByNomeLike(String string);
	
	

}
