package execaoErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivNum {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		float result = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe numero e denominador: ");
		
		try {
			num1 = input.nextInt();
			
			num2 = input.nextInt();
			
			result = num1/num2;
		}
		
		catch(ArithmeticException exc) {
			System.err.println("Divisao incorreta! Erro"+ exc.getMessage());
		}
		
		catch(InputMismatchException exc) {
			System.err.println("Entrada incorreta! Erro:" + exc.getMessage());
		}
		
		finally {
			input.close();
		}
		
		System.out.println("Os valores informados foram: "+num1+" e "+num2);
		System.out.println("O divisao entre eles e = "+result);

	}
	
		
	
}
