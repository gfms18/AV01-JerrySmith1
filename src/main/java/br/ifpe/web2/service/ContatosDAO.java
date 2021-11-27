package br.ifpe.web2.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifpe.web2.model.Contato;

@Repository
public interface ContatosDAO extends JpaRepository<Contato, Integer> {
	
}
