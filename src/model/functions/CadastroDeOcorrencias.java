package model.functions;

import java.util.Scanner;

public class CadastroDeOcorrencias {

	public void menuOcorrencias() {
		int opcaoOcorrencia;

		
			Scanner ocorrencias = new Scanner(System.in);
			System.out.print("|-------------------------------------------|\n");
			System.out.print("| Opção 1 - Incluir Ocorrência              |\n");
			System.out.print("| Opção 2 - Incluir Observações             |\n");
			System.out.print("| Opção 3 - Incluir Advertência             |\n");
			System.out.print("| Opção 4 - Sair                            |\n");
			System.out.print("|-------------------------------------------|\n");

			opcaoOcorrencia = ocorrencias.nextInt();

			switch (opcaoOcorrencia) {
			case 1:
				System.out.print("Por favor digite a Ocorrência: ");
				ocorrencias.nextLine();
				break;
			case 2:
				System.out.print("Por favor digite a Observação: ");
				ocorrencias.nextLine();
				break;
			case 3:
				System.out.print("Por favor digite a Advertência: ");
				ocorrencias.nextLine();
				break;
			case 4:
				System.out.print("\nAté logo!");
				ocorrencias.close();
			default:
				System.out.print("\nOpção Inválida!");
				break;
			}
		} 
	}
