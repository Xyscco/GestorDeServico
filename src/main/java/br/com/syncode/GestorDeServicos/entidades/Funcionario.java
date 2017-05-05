package br.com.syncode.GestorDeServicos.entidades;

public class Funcionario {

	private Long codFuncionario;
	private String numeroMatricula;
	private Usuario usuario;

	public Funcionario() {
		super();
	}

	public Funcionario(Long codFuncionario, String numeroMatricula, Usuario usuario) {
		super();
		this.codFuncionario = codFuncionario;
		this.numeroMatricula = numeroMatricula;
		this.usuario = usuario;
	}

	public Long getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(Long codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
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
		result = prime * result + ((codFuncionario == null) ? 0 : codFuncionario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (codFuncionario == null) {
			if (other.codFuncionario != null)
				return false;
		} else if (!codFuncionario.equals(other.codFuncionario))
			return false;
		return true;
	}

}
