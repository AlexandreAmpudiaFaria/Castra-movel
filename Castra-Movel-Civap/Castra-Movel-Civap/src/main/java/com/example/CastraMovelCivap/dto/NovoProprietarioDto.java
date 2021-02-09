package com.example.CastraMovelCivap.dto;

import com.example.CastraMovelCivap.model.Proprietario;

public class NovoProprietarioDto {

	private Long txtCadUnico;
	private String txtNomeProprietario;
	private String txtCPF;
	private String txtTelefone;
	private String txtEmail;
	private String txtLogradouro;
	private String txtNumero;
	private String txtBairro;
	private String txtCidade;
	
	
	public Long getTxtCadUnico() {
		return txtCadUnico;
	}
	public void setTxtCadUnico(Long txtCadUnico) {
		this.txtCadUnico = txtCadUnico;
	}
	public String getTxtNomeProprietario() {
		return txtNomeProprietario;
	}
	public void setTxtNomeProprietario(String txtNomeProprietario) {
		this.txtNomeProprietario = txtNomeProprietario;
	}
	public String getTxtCPF() {
		return txtCPF;
	}
	public void setTxtCPF(String txtCPF) {
		this.txtCPF = txtCPF;
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
	public String getTxtLogradouro() {
		return txtLogradouro;
	}
	public void setTxtLogradouro(String txtLogradouro) {
		this.txtLogradouro = txtLogradouro;
	}
	public String getTxtNumero() {
		return txtNumero;
	}
	public void setTxtNumero(String txtNumero) {
		this.txtNumero = txtNumero;
	}
	public String getTxtBairro() {
		return txtBairro;
	}
	public void setTxtBairro(String txtBairro) {
		this.txtBairro = txtBairro;
	}
	public String getTxtCidade() {
		return txtCidade;
	}
	public void setTxtCidade(String txtCidade) {
		this.txtCidade = txtCidade;
	}
	
	public Proprietario toProprietario() {
		Proprietario proprietario = new Proprietario();
		proprietario.setCadUnico(txtCadUnico);
		proprietario.setNome(txtNomeProprietario);
		proprietario.setCpf(txtCPF);
		proprietario.setTelefone(txtTelefone);
		proprietario.setEmail(txtEmail);
		proprietario.setLogradouro(txtLogradouro);
		proprietario.setNumero(txtNumero);
		proprietario.setBairro(txtBairro);
		proprietario.setCidade(txtCidade);
		return proprietario;
	}
	
	
	
	
	
	
}