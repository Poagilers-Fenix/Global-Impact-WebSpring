package br.com.fiap.wefeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.wefeed.model.DoacaoAlimento;

public interface NovaDoacaoRepository extends JpaRepository<DoacaoAlimento, Long>{

}
