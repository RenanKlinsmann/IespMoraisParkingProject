package model.functions;

import java.util.Scanner;

public class PortalDoAluno {
	public void menuA() {

		/*
		 * String login = "adm"; String login1; String senha = "123"; String senha1;
		 * 
		 * Scanner loginUsuario = new Scanner(System.in); Scanner senhaUsuario = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("Digite seu usuario: "); login1 = loginUsuario.nextLine();
		 * System.out.print("Digite sua senha: "); senha1 = senhaUsuario.nextLine();
		 * 
		 * if(login1 == login && senha1 == senha) {
		 * System.out.println("Logado com sucesso!"); }else {
		 * System.out.println("acesso negado!"); } loginUsuario.close();
		 * senhaUsuario.close();
		 */

		int opcaoAluno;

		Scanner menuAluno = new Scanner(System.in);

		System.out.print("##--Morais Parking Teste Estrutura de Menu Aluno--##\n\n");
		System.out.print("|------------------------------------------|\n");
		System.out.print("| Op��o 1 - Ocorr�ncias e Advert�ncias     |\n");
		System.out.print("| Op��o 2 - Veiculos cadastrados           |\n");
		System.out.print("| Op��o 3 - Cadastrar novos Veiculos       |\n");
		System.out.print("| Op��o 4 - Remover Veiculos               |\n");
		System.out.print("| Op��o 5 - Sair                           |\n");
		System.out.print("|------------------------------------------|\n");
		System.out.print("Digite uma op��o: ");

		opcaoAluno = menuAluno.nextInt();

		switch (opcaoAluno) {
		case 1:
			System.out.print("\nOp��o Ocorr�ncias");
			break;

		case 2:
			System.out.print("\nOp��o Veiculos cadastrados\n");
			break;

		case 3:
			System.out.print("\nOp��o Cadastrar veiculos\n");
			break;

		case 4:
			System.out.print("\nOp��o Remover veiculos\n");
			break;

		case 5:
			System.out.print("\nAt� logo!");
			menuAluno.close();

		default:
			System.out.print("\nOp��o Inv�lida!");
			break;

		}

	}
}
