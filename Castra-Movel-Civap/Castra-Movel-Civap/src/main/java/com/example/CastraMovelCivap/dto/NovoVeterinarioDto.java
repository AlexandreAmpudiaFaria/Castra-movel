package com.example.CastraMovelCivap.dto;

import com.example.CastraMovelCivap.model.Veterinario;

public class NovoVeterinarioDto {

	private String txtNomeVet;
	private String txtCpfVet;
	private String txtTelefone;
	private String txtEmail;
	public String getTxtNomeVet() {
		return txtNomeVet;
	}
	public void setTxtNomeVet(String txtNomeVet) {
		this.txtNomeVet = txtNomeVet;
	}
	public String getTxtCpfVet() {
		return txtCpfVet;
	}
	public void setTxtCpfVet(String txtCpfVet) {
		this.txtCpfVet = txtCpfVet;
	}
	public String getTxtTelefone() {
		return txtTelefone;
	}
	public void setTxtTelefone(String txtTelefone) {
		this.txtTelefone = txtTelefone;
	}
	public String getTxtEmail() {
		return txtEmail;
	}
	public void setTxtEmail(String txtEmail) {
		this.txtEmail = txtEmail;
	}
	public Veterinario NewVeterinario() {
		Veterinario vet = new Veterinario();
		vet.setNome(txtNomeVet);
		vet.setCpfVet(txtCpfVet);
		vet.setTelefone(txtTelefone);
		vet.setEmail(txtEmail);
		return vet;
	}
	
	
	
	

}
