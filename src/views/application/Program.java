package views.application;

import java.util.Scanner;

import model.functions.PortalDoAluno;
import model.functions.PortalDoFuncionario;

public class Program {

	public static void main(String[] args) {

		int opcao;

		Scanner menu = new Scanner(System.in);

		System.out.print("##--Morais Parking Teste Estrutura de Menu--##\n\n");
		System.out.print("|------------------------------------------|\n");
		System.out.print("| Op��o 1 - Portal do Aluno                |\n");
		System.out.print("| Op��o 2 - Portal do Funcionario          |\n");
		System.out.print("| Op��o 3 - Sair                           |\n");
		System.out.print("|------------------------------------------|\n");
		System.out.print("Digite uma op��o: ");

		opcao = menu.nextInt();

		switch (opcao) {
		case 1:
			PortalDoAluno portalDoAluno = new PortalDoAluno();
			portalDoAluno.menuA();
			System.out.println(portalDoAluno);
			break;

		case 2:
			PortalDoFuncionario portalDoFuncionario = new PortalDoFuncionario();
			portalDoFuncionario.menuFuncionario();
			System.out.print(portalDoFuncionario);
			break;

		case 3:
			System.out.print("\nAt� logo!");
			menu.close();
		default:
			System.out.print("\nOp��o Inv�lida!");
			break;

		}

	}

}
