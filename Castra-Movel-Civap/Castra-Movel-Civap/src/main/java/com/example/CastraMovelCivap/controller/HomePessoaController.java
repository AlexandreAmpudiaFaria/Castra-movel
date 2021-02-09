package com.example.CastraMovelCivap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePessoaController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
