package execaoErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetUsuario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vet[] = new int[10];
		int num = 0, cont = 0;
		
		System.out.println("Informe os valores do vetor. Insera 0 para parar");
		
		try {
			do{
				System.out.println("Valor da "+(cont+1)+"a posicao: ");
				num = input.nextInt();
				vet[cont] = num;
				cont++;
			}while(num != 0);

		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.err.println("Posicao invalida no vetor!Erro: "+exc.getMessage());
		}
		
		catch(InputMismatchException exc) {
			System.err.println("Entrada invalida!Erro: "+exc.getMessage());
		}
		
		finally {
			input.close();
		}
		
		for(int i = 0; i < cont; i++) {
			System.out.println("Vet["+i+"] = " +vet[i]);
		}
	}
	
}
