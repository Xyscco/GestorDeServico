package br.com.syncode.GestorDeServicos.entidades;

import br.com.syncode.GestorDeServicos.entidades.Fornecedor;
import br.com.syncode.GestorDeServicos.entidades.Servico;
import br.com.syncode.GestorDeServicos.entidades.TipoServico;

public class Servico {

	private Long codigo;
	private String descricao;
	private Double valor;
	private Fornecedor fornecedor;
	private TipoServico tipo;

	public Servico() {
		super();
	}

	public Servico(Long codigo, String descricao, Double valor, Fornecedor fornecedor, TipoServico tipo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.tipo = tipo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public TipoServico getTipo() {
		return tipo;
	}

	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Servico other = (Servico) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
