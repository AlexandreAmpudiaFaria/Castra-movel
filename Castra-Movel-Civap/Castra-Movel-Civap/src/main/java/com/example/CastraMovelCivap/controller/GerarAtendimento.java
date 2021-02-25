package com.example.CastraMovelCivap.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CastraMovelCivap.dto.NovoAtendimentoDto;
import com.example.CastraMovelCivap.model.Atendimento;
import com.example.CastraMovelCivap.repository.AtendimentoRepository;



@Controller
@RequestMapping("/gerar")
public class GerarAtendimento {
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@PostMapping("/encaminhar")
	public String encaminhamento(Long id, NovoAtendimentoDto requisicao) {
		Atendimento atendimento = requisicao.toAtendimento();
		atendimentoRepository.save(atendimento);
		return ("redirect:/home");
	}
	

}
