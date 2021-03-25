package br.ucsal.bes20202.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ucsal.bes20202.poo.entities.Disciplina;
import br.ucsal.bes20202.poo.entities.Professor;

public class Program {

	public static void main(String[] args) {
		obterDados();
	}

	private static void obterDados() {
		List<Professor> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);

		System.out.println("Quantos professores deseja cadastrar ? :");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Cadastrando professor número " + (i + 1) + ":\n");

			System.out.println("#Dados do professor :");

			System.out.println("Digite a matrícula do professor :");
			int matricula = in.nextInt();

			System.out.println("Digite o nome do professor :");
			in.nextLine();
			String nome = in.nextLine();

			System.out.println("Digite o telefone do professor :");
			String telefone = in.nextLine();

			System.out.println("Digite o email do professor :");
			String email = in.next();

			System.out.println("");

			System.out.println("Quantas disciplinas o professor Leciona ? :");
			int nd = in.nextInt();

			Professor professor = new Professor(matricula, nome, telefone, email);
			list.add(professor);

			for (int x = 0; x < nd; x++) {
				System.out.println("#Dados da Disciplina " + (x + 1) + ":" + "\n");

				System.out.println("Digite o código da disciplina :");
				String codigo = in.next();

				System.out.println("Digite o nome da disciplina :");
				in.nextLine();
				String nomeDisciplina = in.nextLine();

				System.out.println("Digite a carga horária da disciplina :");
				int cargaHoraria = in.nextInt();

				professor.addDisciplina(new Disciplina(codigo, nomeDisciplina, cargaHoraria));

			}

		}

		for (Professor x : list) {
			System.out.println("-----------//-----------------//---------------//----------------//--------------");
			System.out.println(x);
		}

		in.close();
	}
}
