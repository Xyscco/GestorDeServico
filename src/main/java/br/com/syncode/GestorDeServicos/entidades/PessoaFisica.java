package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Pessoa;

public class PessoaFisica {

	private String nome;
	private String cpf;
	private String telFixo;
	private String telCelular;
	private Pessoa pessoa;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String cpf, String telFixo, String telCelular) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telFixo = telFixo;
		this.telCelular = telCelular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
