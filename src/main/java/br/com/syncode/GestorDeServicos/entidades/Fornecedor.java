package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Servico;
import br.com.syncode.GestorDeServicos.entidades.Usuario;

public class Fornecedor {

	private Long codigoFornecedor;
	private Usuario usuario;
	private Servico servico;

	public Fornecedor() {
		super();
	}

	public Fornecedor(Long codigoFornecedor, Usuario usuario) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.usuario = usuario;
	}

	public Long getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(Long codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoFornecedor == null) ? 0 : codigoFornecedor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (codigoFornecedor == null) {
			if (other.codigoFornecedor != null)
				return false;
		} else if (!codigoFornecedor.equals(other.codigoFornecedor))
			return false;
		return true;
	}

}