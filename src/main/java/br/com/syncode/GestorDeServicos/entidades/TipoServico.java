package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Servico;
import br.com.syncode.GestorDeServicos.entidades.TipoServico;

public class TipoServico {

	private Long codTipoServ;
	private String descricao;
	private Servico servico;

	public TipoServico() {
		super();
	}

	public TipoServico(Long codTipoServ, String descricao) {
		super();
		this.codTipoServ = codTipoServ;
		this.descricao = descricao;
	}

	public Long getCodTipoServ() {
		return codTipoServ;
	}

	public void setCodTipoServ(Long codTipoServ) {
		this.codTipoServ = codTipoServ;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codTipoServ == null) ? 0 : codTipoServ.hashCode());
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
		TipoServico other = (TipoServico) obj;
		if (codTipoServ == null) {
			if (other.codTipoServ != null)
				return false;
		} else if (!codTipoServ.equals(other.codTipoServ))
			return false;
		return true;
	}

}

