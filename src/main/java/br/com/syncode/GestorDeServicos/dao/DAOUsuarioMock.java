package br.com.syncode.GestorDeServicos.dao;

import  java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.syncode.GestorDeServicos.Entidade;



public class DAOUsuarioMock implements DAO {
	
	private Map<Serializable, Entidade> usuario = new HashMap<Serializable, Entidade>();

	public <T extends Entidade<ID>, ID extends Serializable> void persisteObjeto(T objeto) {
		usuario.put(objeto.getId(), objeto);

	}

	public <T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto) {
		usuario.remove(objeto.getId());

	}
	
	public <T extends Entidade<ID>, ID extends Serializable> void atualizaObjeto(T objeto) {
		usuario.put(objeto.getId(), objeto);
		objeto.persiste();
		
	}

	public Entidade getObjeto(String id) {
		return usuario.get(id.toString());
	}

	public Collection<Entidade> getObjetos() {
		return usuario.values();
	}


}
