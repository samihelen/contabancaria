package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		//teste classe conta
				Conta c1 = new Conta(1, 123, 1, "Helen", 10000.0f);
				c1.visualizar();
				c1.sacar(12000.0f);
				c1.visualizar();
				c1.depositar(5000.0f);
				c1.visualizar();
				
		// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Gustavo Santos", 0.0f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
		// Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Rebeca Santos", 100000.0f, 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					          +"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  BANCO DO BRAZIL                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			} switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				
				break;
			case 2:
				System.out.println("Listar todas as contas\n\n");
				
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				
				break;
			case 6:
				System.out.println("Saque\n\n");
				
				break;
				
			case 7:
				System.out.println("Depósito\n\n");
				
				break;
				
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				
				break;
			default:
				System.out.println("\nOpção Inválida\n");
				break;
			
			}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Helen Samira ");		
		System.out.println("https://github.com/samihelen");
		System.out.println("*********************************************************");
	}
	
}
