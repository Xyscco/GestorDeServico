package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Pessoa;

public class PessoaJuridica {

	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String telFixo;
	private String telCelular;
	private Pessoa pessoa;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String inscricaoEstadual, String telFixo,
			String telCelular) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telFixo = telFixo;
		this.telCelular = telCelular;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelFixo() {
		return telFixo;
	}

	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

}
