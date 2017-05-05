package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Endereco;
import br.com.syncode.GestorDeServicos.entidades.Fornecedor;
import br.com.syncode.GestorDeServicos.entidades.Funcionario;
import br.com.syncode.GestorDeServicos.entidades.Pessoa;

public class Usuario {

	private Pessoa pessoa;
	private String login;
	private String senha;
	private Endereco endereco;
	private Fornecedor fornecedor;
	private Funcionario funcionario;

	public Usuario() {
		super();
	}

	public Usuario( Pessoa pessoa, String login, String senha, Endereco endereco) {
		super();
		this.pessoa = pessoa;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}
