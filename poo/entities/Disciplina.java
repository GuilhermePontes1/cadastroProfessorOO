package br.ucsal.bes20202.poo.entities;

public class Disciplina {
	private String codigo;
	private String nome;
	private Integer cargaHoraria;

	public Disciplina(String codigo, String nome, Integer cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Código:" + codigo + ";" + "Nome=" + nome + ";" + "Carga Horaria=" + cargaHoraria + "; ";
	}

}
