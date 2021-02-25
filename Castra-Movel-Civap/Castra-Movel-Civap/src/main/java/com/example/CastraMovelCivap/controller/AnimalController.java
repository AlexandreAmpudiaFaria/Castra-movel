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
	public String listarAnimais(Model model) {		
		List<Animal> animais = animalRepository.findAll();
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";
	}
	
	@GetMapping("/listarPorBairro")
	public String listarPorBairro(String txtBusca, Model model) {		
		List<Animal> animais = animalRepository.findByProprietarioBairro(txtBusca.toUpperCase());
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";
	}
	
	@GetMapping("/listarPorCidade")
	public String listarPorCidade(Long id, Model model) {		
		List<Animal> animais = animalRepository.findByProprietarioCidadeId(id);
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";
	}
	
	@GetMapping("/listarAnimaisDoProprietario")
	public String listarAnimaisDoProp(Long id, Model model) {
		System.out.println(id);
		List<Animal> animais = animalRepository.findByProprietarioId(id);
		model.addAttribute("animais", animais);		
		return "/animal/listarAnimais";				
		
	}
	
	
	@GetMapping("/cadastrarAnimal")
	public String cadastrarAnimal() {
		return "/animal/cadastrarAnimal";
	}
	
	@PostMapping("/novoAnimal")
	public String novoAnimal(NovoAnimalDto requisicao) {
		Animal animal = requisicao.NewAnimal();
		animalRepository.save(animal);
		return ("redirect:/animais/listarAnimais");
	}
	

}
	
	
