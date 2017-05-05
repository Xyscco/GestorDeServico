package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.PessoaFisica;
import br.com.syncode.GestorDeServicos.entidades.PessoaJuridica;
import br.com.syncode.GestorDeServicos.entidades.Usuario;

public class Pessoa {

	private PessoaFisica pf;
	private PessoaJuridica pj;
	private Usuario usuario;

	public PessoaFisica getPf() {
		return pf;
	}

	public void setPf(PessoaFisica pf) {
		this.pf = pf;
	}

	public PessoaJuridica getPj() {
		return pj;
	}

	public void setPj(PessoaJuridica pj) {
		this.pj = pj;
	}

}