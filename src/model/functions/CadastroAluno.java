package model.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Aluno;
import model.entities.Veiculo;

public class CadastroAluno {
	
	public void CadastroAlunoVeiculo() {

		Scanner sc = new Scanner(System.in);

		List<Aluno> list = new ArrayList<>();

		try {
			System.out.println("Quantos Alunos deseja cadastrar? ");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {

				System.out.println("Digite os dados ->");
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Matricula: ");
				Integer id = sc.nextInt();
				System.out.print("Curso: ");
				String curso = sc.nextLine();
				sc.nextLine();
				System.out.print("Primeira Senha: ");
				String senha = sc.nextLine();
				Aluno aluno = new Aluno(nome, senha, id, curso);
				list.add(aluno);
				System.out.println("-------------------------------");
				System.out.println("Quantos Veiculos deseja Cadastrar?");
				int n2 = sc.nextInt();

				for (int j = 1; j <= n2; j++) {

					System.out.println("Digite os dados do Veiculo para prosseguir");
					System.out.print("Placa: ");
					String placa = sc.nextLine();
					sc.nextLine();
					System.out.print("Modelo: ");
					String modelo = sc.nextLine();
					System.out.print("Cor: ");
					String cor = sc.nextLine();
					System.out.print("Ano de Fabricação: ");
					Integer ano = sc.nextInt();
					Veiculo veiculos = new Veiculo(placa, modelo, cor, ano);
					aluno.addQuantVeiculos(veiculos);
					System.out.println("-------------------------------");
				}
			}
			System.out.println("-------------------------------");
			for (Aluno obj : list) {
				System.out.println(obj);
			}
		} catch (RuntimeException e) {
			System.out.println("Erro Inesperado!");
			System.out.println("Reinicie o Programa e verifique se esta fazendo correto!");
		}
		sc.close();

	}
}
