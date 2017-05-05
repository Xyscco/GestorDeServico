package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Cliente;
import br.com.syncode.GestorDeServicos.entidades.Pedido;
import br.com.syncode.GestorDeServicos.entidades.Usuario;

public class Cliente {

	private Long codCliente;
	private Usuario usuario;
	private Pedido pedido;

	public Cliente() {
		super();
	}

	public Cliente(Long codCliente, Usuario usuario) {
		super();
		this.codCliente = codCliente;
		this.usuario = usuario;
	}

	public Long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
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
		result = prime * result + ((codCliente == null) ? 0 : codCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codCliente == null) {
			if (other.codCliente != null)
				return false;
		} else if (!codCliente.equals(other.codCliente))
			return false;
		return true;
	}

}
