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
			System.out.print("| Opção 1 - Verificar Veiculos                           |\n");
			System.out.print("| Opção 2 - Incluir Ocorrência/Observações/Advertência   |\n");
			System.out.print("| Opção 3 - Cadastrar novos Veiculos                     |\n");
			System.out.print("| Opção 4 - Cadastrar Veiculos Visitantes                |\n");
			System.out.print("| Opção 5 - Remover Veiculos                             |\n");
			System.out.print("| Opção 6 - Status do Estacionamento                     |\n");
			System.out.print("| Opção 7 - Cadastrar Eventos                            |\n");
			System.out.print("| Opção 8 - Relatórios                                   |\n");
			System.out.print("| Opção 9 - Sair                                         |\n");
			System.out.print("|--------------------------------------------------------|\n");
			System.out.print("Digite uma opção: ");

			opcaoFuncionario = menuFuncionario.nextInt();

			if (opcaoFuncionario == 1) {
				System.out.print("\nOpção Verificar Veiculos");
			} else if (opcaoFuncionario == 2) {
				cadastroDeOcorrencias.menuOcorrencias();
			} else if (opcaoFuncionario == 3) {
				cadastroAluno.CadastroAlunoVeiculo();
			} else if (opcaoFuncionario == 4) {
				System.out.print("\nOpção Cadastrar Veiculos Visitantes\n");
			} else if (opcaoFuncionario == 5) {
				aluno.removeQuantVeiculos(veiculo);
			} else if (opcaoFuncionario == 6) {
				System.out.print("\nOpção Status do Estacionamento\n");
			} else if (opcaoFuncionario == 7) {
				System.out.print("\nOpção Cadastrar Eventos\n");
			} else if (opcaoFuncionario == 8) {
				System.out.print("\nRelatórios!");
			} else if (opcaoFuncionario == 9) {
				System.out.print("\nRelatórios!");
				menuFuncionario.close();
			} else {
				System.out.print("\nOpção Inválida!");
			}
	

	}

}
