package com.example.CastraMovelCivap.dto;

import com.example.CastraMovelCivap.model.Animal;
import com.example.CastraMovelCivap.model.Proprietario;
import com.example.CastraMovelCivap.model.Sexo;
import com.example.CastraMovelCivap.model.Tipo;

public class NovoAnimalDto {

	private String txtNomeAnimal;
	
	private Long txtTipo;
	private Long txtSexo;
	private Long txtprop;
	private String txtRaca;
	private Long txtIdade;
	private String txtCor;
	private String txtObservacao;
	
	
	public String getTxtNomeAnimal() {
		return txtNomeAnimal;
	}
	public void setTxtNomeAnimal(String txtNomeAnimal) {
		this.txtNomeAnimal = txtNomeAnimal;
	}
	
	public Long getTxtTipo() {
		return txtTipo;
	}
	public void setTxtTipo(Long txtTipo) {
		this.txtTipo = txtTipo;
	}
	
	public Long getTxtSexo() {
		return txtSexo;
	}
	public void setTxtSexo(Long txtSexo) {
		this.txtSexo = txtSexo;
	}
	
	public Long getTxtprop() {
		return txtprop;
	}
	public void setTxtprop(Long txtprop) {
		this.txtprop = txtprop;
	}
	public String getTxtRaca() {
		return txtRaca;
	}
	public void setTxtRaca(String txtRaca) {
		this.txtRaca = txtRaca;
	}
	public Long getTxtIdade() {
		return txtIdade;
	}
	public void setTxtIdade(Long txtIdade) {
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
	
	
	
	public Animal NewAnimal() {
		Animal animal = new Animal();
		
		//salvar o proprietario
		Proprietario prop = new Proprietario();
		prop.setId(txtprop);
		animal.setProprietario(prop);
		
		//salvar o sexo do animal
		Sexo sex = new Sexo();
		sex.setId(txtSexo);
		animal.setSexo(sex);
		
		//salvar o tipo do animal
		Tipo tip = new Tipo();
		tip.setId(txtTipo);
		animal.setTipo(tip);
		//end tipo
		
		animal.setNomeAnimal(txtNomeAnimal);		
		animal.setRaca(txtRaca);
		animal.setIdade(txtIdade);
		animal.setCor(txtCor);
		animal.setObservacao(txtObservacao);
		animal.setStatus(true);
		return animal;
	}
	
	
	
	
}
