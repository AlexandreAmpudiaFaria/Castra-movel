package com.example.CastraMovelCivap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeCid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCid() {
		return nomeCid;
	}

	public void setNomeCid(String nomeCid) {
		this.nomeCid = nomeCid;
	}
	
	
	
}
