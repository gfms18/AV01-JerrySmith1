package br.ifpe.web2.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;




@Entity
public class Grupo {
	@Id
	private String nomedogrupo;
	@Enumerated(EnumType.STRING)
	private VISIBILIDADE visibilidade;
	
	private String dataexpiracao;
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
	
	public String getDataexpiracao() {
		return dataexpiracao;
	}
	public void setDataexpiracao(String dataexpiracao) {
		this.dataexpiracao = dataexpiracao;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	
