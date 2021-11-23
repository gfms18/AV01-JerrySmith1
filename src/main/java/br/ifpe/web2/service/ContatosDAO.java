package br.ifpe.web2.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web2.model.Contato;

public interface ContatosDAO extends JpaRepository<Contato, String> {
	
}
