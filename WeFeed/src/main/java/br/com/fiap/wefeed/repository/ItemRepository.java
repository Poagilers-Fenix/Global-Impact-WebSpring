package br.com.fiap.wefeed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.wefeed.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	List<Item> findByNomeLike(String nome);

}
