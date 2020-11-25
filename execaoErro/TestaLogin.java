package execaoErro;

import java.util.Scanner;

public class TestaLogin {

	public static void main(String[] args) {
		
		String login, senha;
		Scanner input = new Scanner(System.in);
	
		System.out.println("Informe o seu login: ");
		login = input.next();
		System.out.println("Informe a sua senha: ");
		senha = input.next();
		
		Login testaLogin = new Login(login, senha);
		
		System.out.println("Confirme seu login: ");
		login = input.next();
		System.out.println("Confirme sua senha: ");
		senha = input.next();
		
		testaLogin.fazerLogin(login, senha);

	}

}
