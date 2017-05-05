package br.com.syncode.GestorDeServicos.entidades;

import java.util.Date;

import br.com.syncode.GestorDeServicos.enumerados.StatusPedido;

public class Pedido {

	private Long codPedido;
	private Servico servico;
	private int quantidade;
	private Date dataSolicitacao;
	private Date dataEntrega;
	private Funcionario funcResponsavel;
	private Cliente cliente;
	private StatusPedido status;

	public Pedido() {
		super();
	}

	public Pedido(Long codPedido, Servico servico, int quantidade, Date dataSolicitacao, Date dataEntrega,
			Funcionario funcResponsavel, Cliente cliente, StatusPedido status) {
		super();
		this.codPedido = codPedido;
		this.servico = servico;
		this.quantidade = quantidade;
		this.dataSolicitacao = dataSolicitacao;
		this.dataEntrega = dataEntrega;
		this.funcResponsavel = funcResponsavel;
		this.cliente = cliente;
		this.status = status;
	}

	public Long getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Long codPedido) {
		this.codPedido = codPedido;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Funcionario getFuncResponsavel() {
		return funcResponsavel;
	}

	public void setFuncResponsavel(Funcionario funcResponsavel) {
		this.funcResponsavel = funcResponsavel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPedido == null) ? 0 : codPedido.hashCode());
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
		Pedido other = (Pedido) obj;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		return true;
	}

}
