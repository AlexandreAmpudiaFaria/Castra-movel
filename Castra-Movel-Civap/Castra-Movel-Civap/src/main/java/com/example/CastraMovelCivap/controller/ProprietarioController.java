package com.example.CastraMovelCivap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.CastraMovelCivap.dto.NovoProprietarioDto;
import com.example.CastraMovelCivap.model.Proprietario;
import com.example.CastraMovelCivap.repository.ProprietarioRepository;

@Controller
@RequestMapping("/proprietario")
public class ProprietarioController {

	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	@GetMapping("/listarProprietarios")
	public String listarProprietarios(Model model) {
		List<Proprietario> proprietarios = proprietarioRepository.findAll();			
		model.addAttribute("proprietarios", proprietarios);
		return "/proprietario/listarProprietarios";
	}
	
	@GetMapping("/listarProp")
	public String listarPorCidade(Long id, Model model) {
			List<Proprietario> proprietarios = proprietarioRepository.findByCidadeId(id);
			model.addAttribute("proprietarios", proprietarios);
			return "/proprietario/listarProprietarios";					
		
	}
	
	@GetMapping("/cadastrarProprietario")
	public String cadastrarMedico() {
		return "proprietario/cadastrarProprietario";
	}
	
	@PostMapping("/novoProprietario")
	public String novoProprietario(NovoProprietarioDto requisicao) {
		Proprietario proprietario = requisicao.toProprietario();
		proprietarioRepository.save(proprietario);
		return ("redirect:/proprietario/listarProprietarios");
	}
	
}
