package br.ucsal.bes20202.poo.entities;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private Integer matricula;
	private String nome;
	private String telefone;
	private String email;

	private List<Disciplina> listDisciplina = new ArrayList<>();

	public Professor(Integer matricula, String nome, String telefone, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void addDisciplina(Disciplina disciplina) {
		listDisciplina.add(disciplina);
	}
	
	public void removeDisciplina(Disciplina disciplina) {
		listDisciplina.remove(disciplina);
	}

	@Override
	public String toString() {
		return 	"\n"
				+ "Nome : " + nome  + "; "
				+ "Matricula=" + matricula  + "; "
				+ "Telefone=" + telefone + "; "
				+ "Email=" + email + "; "
				+ "Disciplinas :" + listDisciplina;
	}

}
