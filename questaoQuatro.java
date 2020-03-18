package aulasJava;

import java.util.Scanner;
import java.util.Locale;

public class questaoQuatro{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        int n = 1, cont = 1, testa = 0, espaco = 0;
       
        System.out.println("N      10*N    100*N    1000*N");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(n);
                System.out.print("      ");
                n = n * 10;
            }
            cont++;
            n = 1;
            System.out.println();
            n = n * cont;
        }
    }    
}