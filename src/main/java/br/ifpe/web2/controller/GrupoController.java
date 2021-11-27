package br.ifpe.web2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;


import br.ifpe.web2.model.Grupo;

import br.ifpe.web2.service.GrupoService;

@Controller
public class GrupoController {
	@Autowired
	GrupoService grupoService;
	
	
	@GetMapping("/criargrupo")
	public String exibirForm(Grupo grupo) {
		
		return "criargrupo";
		
	}
	
	@PostMapping("/salvarGrupo")
	public String salvarGrupo(Grupo grupo) {
		grupoService.salvarGrupo(grupo);
		return "redirect:/listarGrupo";
	}
	
	@GetMapping("/listarGrupo")
	public String listarGrupo(Model model) {
		model.addAttribute("lista",grupoService.listarGrupo());
		return "grupo-list";
	}
	
	@GetMapping("/removerGrupo")
	public String removerGrupo(Integer id) {
		grupoService.removerGrupo(id);
		return "redirect:/grupo-list";
	}
	
	@GetMapping("/editarGrupo")
	public String editarGrupo(Integer id, Model model) {
		model.addAttribute("Grupo", grupoService.buscarGrupo(id));
		return "criargrupo";
	}

	
	
}
