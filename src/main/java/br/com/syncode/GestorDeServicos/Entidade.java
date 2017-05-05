package br.com.syncode.GestorDeServicos;

import java.io.Serializable;

public abstract class Entidade<ID extends Serializable> {

	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public void persiste() {
		// TODO implementar quando tiver comunicação com banco usando
		// hibernate
	}

	public boolean isTransient() {
		return getId() == null;
	}

	public void exclui() {
		// TODO implementar quando tiver comunicação com banco usando
		// hibernate
	}

}