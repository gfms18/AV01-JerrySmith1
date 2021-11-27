package br.ifpe.web2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web2.model.Contato;
import br.ifpe.web2.model.Grupo;
import br.ifpe.web2.service.ContatoService;
import br.ifpe.web2.service.ContatosDAO;
import br.ifpe.web2.service.GrupoService;

@Controller
public class ContatoController {
	@Autowired
	ContatoService contatoService;
	@Autowired
	GrupoService grupoService;
	
	

	@GetMapping("/exibirContato")
	public String exibirForm(Contato contato, Model model) {
		List<Grupo> listaGrupo = grupoService.pegarGrupos();
		model.addAttribute("listaDeGrupo", listaGrupo);
		return "contatos-form";
		
	}
	
	
	
	@PostMapping("/salvarContato")
	public String salvarContato(Contato contato) {
		contatoService.salvarContato(contato);
		return "redirect:/listarContatos";
	}
	
	@GetMapping("/listarContatos")
	public String listarContatos(Model model) {
		//model.addAttribute("lista", contatos);
		model.addAttribute("lista",contatoService.listarContato());
		return "contatos-list";
	}
	
	@GetMapping("/removerContato")
	public String removerContato(Integer id) {
		contatoService.removerContato(id);
		return "redirect:/listarContatos";
	}
	
	@GetMapping("/editarContato")
	public String editarContato(Integer id, Model model) {
		model.addAttribute("cont", contatoService.buscarContato(id));
		model.addAttribute("listaDeGrupo", grupoService.pegarGrupos());
		return "contatos-form";
	}
	
	
}
