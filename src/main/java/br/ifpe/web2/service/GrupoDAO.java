package br.ifpe.web2.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifpe.web2.model.Grupo;
import br.ifpe.web2.model.VISIBILIDADE;


@Repository
public interface GrupoDAO extends JpaRepository<Grupo, Integer> {
	public List<Grupo> findGrupoByDataExpiracaoAfter(Date dataExpiracao);
	
}
