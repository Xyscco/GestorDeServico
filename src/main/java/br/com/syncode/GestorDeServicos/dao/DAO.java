package br.com.syncode.GestorDeServicos.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.syncode.GestorDeServicos.Entidade;

@SuppressWarnings("rawtypes")
public interface DAO {

	<T extends Entidade<ID>, ID extends Serializable> void persisteObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> void atualizaObjeto(T objeto);

	Entidade getObjeto(String id);

	Collection<Entidade> getObjetos();

}