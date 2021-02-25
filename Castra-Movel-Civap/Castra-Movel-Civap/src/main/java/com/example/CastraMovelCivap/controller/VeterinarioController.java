package com.example.CastraMovelCivap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.CastraMovelCivap.dto.NovoVeterinarioDto;
import com.example.CastraMovelCivap.model.Veterinario;
import com.example.CastraMovelCivap.repository.VeterinarioRepository;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	
	@GetMapping("/listarVeterinarios")
	public String listarVeterinarios(Model model) {		
		List<Veterinario> veterinarios = veterinarioRepository.findAll();
		model.addAttribute("veterinarios", veterinarios);		
		return "/veterinario/listarVeterinarios";
	}
	
	@GetMapping("/cadastrarVeterinario")
	public String cadastrarVeterinario() {
		return "/veterinario/cadastrarVeterinario";
	}
	
	@PostMapping("/novoVeterinario")
	public String novoVeterinario(NovoVeterinarioDto requisicao) {
		Veterinario veterinario = requisicao.NewVeterinario();
		veterinarioRepository.save(veterinario);
		return ("redirect:/home");
	}
}
