package model.functions;

import java.util.Scanner;

public class CadastroDeOcorrencias {

	public void menuOcorrencias() {
		int opcaoOcorrencia;

		
			Scanner ocorrencias = new Scanner(System.in);
			System.out.print("|-------------------------------------------|\n");
			System.out.print("| Op��o 1 - Incluir Ocorr�ncia              |\n");
			System.out.print("| Op��o 2 - Incluir Observa��es             |\n");
			System.out.print("| Op��o 3 - Incluir Advert�ncia             |\n");
			System.out.print("| Op��o 4 - Sair                            |\n");
			System.out.print("|-------------------------------------------|\n");

			opcaoOcorrencia = ocorrencias.nextInt();

			switch (opcaoOcorrencia) {
			case 1:
				System.out.print("Por favor digite a Ocorr�ncia: ");
				ocorrencias.nextLine();
				break;
			case 2:
				System.out.print("Por favor digite a Observa��o: ");
				ocorrencias.nextLine();
				break;
			case 3:
				System.out.print("Por favor digite a Advert�ncia: ");
				ocorrencias.nextLine();
				break;
			case 4:
				System.out.print("\nAt� logo!");
				ocorrencias.close();
			default:
				System.out.print("\nOp��o Inv�lida!");
				break;
			}
		} 
	}
