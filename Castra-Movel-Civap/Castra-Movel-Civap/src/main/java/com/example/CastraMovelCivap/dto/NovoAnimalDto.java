package com.example.CastraMovelCivap.dto;

import com.example.CastraMovelCivap.model.Animal;

public class NovoAnimalDto {

	private Long txtCadUnico;
	private String txtNomeAnimal;
	private String txtTipo;
	private String txtSexo;
	private String txtRaca;
	private String txtIdade;
	private String txtCor;
	private String txtObservacao;
	
	
	
	public Long getTxtCadUnico() {
		return txtCadUnico;
	}
	public void setTxtCadUnico(Long txtCadUnico) {
		this.txtCadUnico = txtCadUnico;
	}
	public String getTxtNomeAnimal() {
		return txtNomeAnimal;
	}
	public void setTxtNomeAnimal(String txtNomeAnimal) {
		this.txtNomeAnimal = txtNomeAnimal;
	}
	public String getTxtTipo() {
		return txtTipo;
	}
	public void setTxtTipo(String txtTipo) {
		this.txtTipo = txtTipo;
	}
	public String getTxtSexo() {
		return txtSexo;
	}
	public void setTxtSexo(String txtSexo) {
		this.txtSexo = txtSexo;
	}
	public String getTxtRaca() {
		return txtRaca;
	}
	public void setTxtRaca(String txtRaca) {
		this.txtRaca = txtRaca;
	}
	public String getTxtIdade() {
		return txtIdade;
	}
	public void setTxtIdade(String txtIdade) {
		this.txtIdade = txtIdade;
	}
	public String getTxtCor() {
		return txtCor;
	}
	public void setTxtCor(String txtCor) {
		this.txtCor = txtCor;
	}
	public String getTxtObservacao() {
		return txtObservacao;
	}
	public void setTxtObservacao(String txtObservacao) {
		this.txtObservacao = txtObservacao;
	}
	
	
	public Animal toAnimal() {
		Animal animal = new Animal();
		animal.setProprietario(txtCadUnico);
		animal.setNome(txtNomeAnimal);
		animal.setTipo(txtTipo);
		animal.setSexo(txtSexo);
		animal.setRaca(txtRaca);
		animal.setIdade(txtIdade);
		animal.setCor(txtCor);
		animal.setObservacao(txtObservacao);
		animal.setStatus(true);
		return animal;
	}
	
	
	
	
}
