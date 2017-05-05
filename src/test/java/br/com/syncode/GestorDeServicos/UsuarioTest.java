package br.com.syncode.GestorDeServicos;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.syncode.GestorDeServicos.dao.DAO;
import br.com.syncode.GestorDeServicos.dao.DAOUsuarioMock;
import br.com.syncode.GestorDeServicos.entidades.Usuario;


public class UsuarioTest {

	protected DAO daoUsuario;

	@Before
	public void before() {
		daoUsuario = new DAOUsuarioMock();
	}

	@After
	public void after() {

	}

	@Test
	public void incluiUsuario() {

		Usuario user = new Usuario();

		user.set;
		user.setLogin("user");
		user.setSenha("senha");

		daoUsuario.persisteObjeto(user);

		Usuario userGet = (Usuario) daoUsuario.getObjeto(user.getId());

		Assert.assertEquals(user.getLogin(), userGet.getLogin());
		Assert.assertEquals(user.getSenha(), userGet.getSenha());

	}
	
	@Test
	public void alteraUsuario(){
		

		Usuario user = new Usuario();

		user.setId("1");
		user.setLogin("user");
		user.setSenha("senha");

		daoUsuario.persisteObjeto(user);
		
		Usuario userGet = (Usuario) daoUsuario.getObjeto(user.getId());

		userGet.setLogin("user1");
		userGet.setSenha("senha1");

		daoUsuario.atualizaObjeto(userGet);
		
		Usuario userAtualizado = (Usuario) daoUsuario.getObjeto(user.getId());
		
		
		Assert.assertEquals("user1", userAtualizado.getLogin());
		Assert.assertEquals("senha1", userAtualizado.getSenha());
	}
	
	@Test
	
	public void excluirUsuario(){
		
		Usuario user = new Usuario();
		
		user.setId("1");
		user.setLogin("user");
		user.setSenha("senha");
		daoUsuario.persisteObjeto(user);
		
		Usuario userGet = (Usuario) daoUsuario.getObjeto(user.getId());
		
		Assert.assertNotNull(userGet);
		
		daoUsuario.excluiObjeto(userGet);
		
		Usuario userExcluido = (Usuario) daoUsuario.getObjeto(user.getId());
		
		Assert.assertNull(userExcluido);
		
	}

}
