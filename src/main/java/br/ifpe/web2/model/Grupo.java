package br.ifpe.web2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;




@Entity
public class Grupo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomedogrupo;
	@Enumerated(EnumType.STRING)
	private VISIBILIDADE visibilidade;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataExpiracao;
	public String getNomedogrupo() {
		return nomedogrupo;
	}
	public void setNomedogrupo(String nomedogrupo) {
		this.nomedogrupo = nomedogrupo;
	}
	public VISIBILIDADE getVisibilidade() {
		return visibilidade;
	}
	public void setVisibilidade(VISIBILIDADE visibilidade) {
		this.visibilidade = visibilidade;
	}
	
	
	
	public Date getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	
