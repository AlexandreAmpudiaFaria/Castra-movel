package com.example.CastraMovelCivap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CastraMovelCivap.dto.NovoAnimalDto;
import com.example.CastraMovelCivap.model.Animal;
import com.example.CastraMovelCivap.repository.AnimalRepository;


@Controller
@RequestMapping("/animais")
public class AnimalController {
	
	@Autowired
	private AnimalRepository animalRepository;
	

	@GetMapping("/listarAnimais")
	public String listarAnimais(Model model, Long tipos) {		
		List<Animal> animais = animalRepository.findAll();			
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";
	}
	
	@GetMapping("/listarGatos")
	public String listarGatos(Model model) {	
		Long tipos = (long) 1;
		List<Animal> animais = animalRepository.findByTipo(tipos);			
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";
	}
	
	@GetMapping("/cadastrarAnimal")
	public String cadastrarAnimal() {
		return "animal/cadastrarAnimal";
	}
	
	@PostMapping("/novoAnimal")
	public String novoAnimal(NovoAnimalDto requisicao) {
		Animal animal = requisicao.toAnimal();
		animalRepository.save(animal);
		return ("redirect:/animais/listarAnimais");
	}
	

}
	
	
