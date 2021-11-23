package br.ifpe.web2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web2.model.Contato;
import br.ifpe.web2.model.Grupo;
import br.ifpe.web2.model.VISIBILIDADE;
import br.ifpe.web2.service.GrupoDAO;

@Controller
public class GrupoController {
	@Autowired
	private GrupoDAO grupoDAO;
	private Object grupo;
	@GetMapping("/criargrupo")
	public String Criargrupo() {
		return "criargrupo";
	}
	
	@PostMapping("/salvargrupo") 
		public String Salvargrupo(Grupo grupo) {
		System.out.println(grupo.getNomedogrupo());
		System.out.println(grupo.getDataexpiracao());
		this.grupoDAO.save(grupo);
		return "index";
			
		
	}
	
	
	
	@GetMapping("/listarGrupo")
	public String listarGrupo(Model model) {
		//model.addAttribute("lista", contatos);
		model.addAttribute("list", grupoDAO.findAll());
		return "grupo-list";
	}
	
	@ModelAttribute("enum_visibilidade")
    public VISIBILIDADE[] getEnumvisibilidade() {
        return VISIBILIDADE.values();
        
    }
}
