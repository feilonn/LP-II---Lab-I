package treinoJava;

import java.util.Locale;
import java.util.Scanner;

public class questaoDois{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        int checa;
        double preco,result, totalVendas = 0;
        double aumenta = 0.09;
        double semana = 200;
        
        String vendedor;
        
        
        System.out.println("Nome do vendedor: ");
        vendedor = input.nextLine();
        
        System.out.println("Cadastro de vendas. Continuar[1]/Sair[0]");
        checa = input.nextInt();
        
        while(checa != 0){
      
            System.out.print("Valor da venda R$:");
            preco = input.nextDouble();
            totalVendas = totalVendas + preco;
            
            System.out.println("Continuar[1]/Sair[0]");
            checa = input.nextInt();
        }
        
        result = semana +(aumenta*totalVendas);
        System.out.println("O vendedor "+vendedor+" arrecadou R$"+totalVendas+" e recebera um semanal de R$"+result);
    }
}