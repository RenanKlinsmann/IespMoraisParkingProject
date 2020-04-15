package model.functions;

import java.util.Scanner;

import model.entities.Aluno;
import model.entities.Veiculo;

public class PortalDoFuncionario {
	public void menuFuncionario() {
		Aluno aluno = new Aluno();
		Veiculo veiculo = new Veiculo();
		CadastroAluno cadastroAluno = new CadastroAluno();
		CadastroDeOcorrencias cadastroDeOcorrencias = new CadastroDeOcorrencias();
		int opcaoFuncionario;

	
			Scanner menuFuncionario = new Scanner(System.in);

			System.out.print("##--Morais Parking Teste Estrutura de Menu Funcionario--##\n\n");
			System.out.print("|--------------------------------------------------------|\n");
			System.out.print("| Op��o 1 - Verificar Veiculos                           |\n");
			System.out.print("| Op��o 2 - Incluir Ocorr�ncia/Observa��es/Advert�ncia   |\n");
			System.out.print("| Op��o 3 - Cadastrar novos Veiculos                     |\n");
			System.out.print("| Op��o 4 - Cadastrar Veiculos Visitantes                |\n");
			System.out.print("| Op��o 5 - Remover Veiculos                             |\n");
			System.out.print("| Op��o 6 - Status do Estacionamento                     |\n");
			System.out.print("| Op��o 7 - Cadastrar Eventos                            |\n");
			System.out.print("| Op��o 8 - Relat�rios                                   |\n");
			System.out.print("| Op��o 9 - Sair                                         |\n");
			System.out.print("|--------------------------------------------------------|\n");
			System.out.print("Digite uma op��o: ");

			opcaoFuncionario = menuFuncionario.nextInt();

			if (opcaoFuncionario == 1) {
				System.out.print("\nOp��o Verificar Veiculos");
			} else if (opcaoFuncionario == 2) {
				cadastroDeOcorrencias.menuOcorrencias();
			} else if (opcaoFuncionario == 3) {
				cadastroAluno.CadastroAlunoVeiculo();
			} else if (opcaoFuncionario == 4) {
				System.out.print("\nOp��o Cadastrar Veiculos Visitantes\n");
			} else if (opcaoFuncionario == 5) {
				aluno.removeQuantVeiculos(veiculo);
			} else if (opcaoFuncionario == 6) {
				System.out.print("\nOp��o Status do Estacionamento\n");
			} else if (opcaoFuncionario == 7) {
				System.out.print("\nOp��o Cadastrar Eventos\n");
			} else if (opcaoFuncionario == 8) {
				System.out.print("\nRelat�rios!");
			} else if (opcaoFuncionario == 9) {
				System.out.print("\nRelat�rios!");
				menuFuncionario.close();
			} else {
				System.out.print("\nOp��o Inv�lida!");
			}
	

	}

}
