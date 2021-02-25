package com.example.CastraMovelCivap.dto;

import java.time.LocalDateTime;

import com.example.CastraMovelCivap.model.Animal;
import com.example.CastraMovelCivap.model.Atendimento;

public class NovoAtendimentoDto {
	
    private LocalDateTime data;	
	private Long txtID;
	private String observacao;	
	

	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public Long getTxtID() {
		return txtID;
	}
	public void setTxtID(Long txtID) {
		this.txtID = txtID;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Atendimento toAtendimento() {
		Animal animal = new Animal();
		Atendimento atendimento = new Atendimento();
		animal.setId(txtID);
		atendimento.setAnimal(animal);
		return null;
	}

}
