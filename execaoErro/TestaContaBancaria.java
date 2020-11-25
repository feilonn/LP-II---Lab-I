package execaoErro;
import java.util.Scanner;

public class TestaContaBancaria {
	public static void main(String[] args) {
		double limite = 0, saldo = 0, valor = 0;
		int escolha;
		Scanner input = new Scanner(System.in);

		System.out.println("-=-=-Cadastro Inicial de Conta Bancaria-=-=-");
		System.out.println("Informe o limite da conta R$:");
		limite = input.nextDouble();
		System.out.println("Informe o saldo da conta R$:");
		saldo = input.nextDouble();
			
		ContaBancaria minhaConta = new ContaBancaria(saldo, limite);
		
		ContaException exception;
		try {
			do{
				System.out.println("Menu:");
				System.out.println("1 - Realizar um Deposito");
				System.out.println("2 - Realizar um Saque");
				System.out.println("0 - Sair");
				
				System.out.println("Informe sua escolha: ");
				escolha = input.nextInt();
				switch(escolha) {
				case 1:
					System.out.println("Informe o valor do deposito R$: ");
					valor = input.nextDouble();
					minhaConta.depositar(valor);
					break;
				case 2:
					System.out.println("Informe o valor do saque R$: ");
					valor = input.nextDouble();
					minhaConta.sacar(valor);
					break;
				case 0:
					System.err.println("Encerrando sistema...");
					break;
				default:
					System.err.println("Opcao invalida!voce sera redirecionado ao menu.");
					break;
				}
				
			
			}while(escolha != 0);
		}
		catch(ContaException e) {
			System.err.println("Erro!"+e.getMessage());
		}
		finally {
			input.close();
		}
	}

}
