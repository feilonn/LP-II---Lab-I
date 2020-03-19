import java.util.Scanner;
import java.util.Locale;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        //Primeira forma
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }System.out.println();
        }
        System.out.println(); 
        
        //Segunda forma
        for(int i = 0; i < 10; i++){
            for(int j = 10; j > i ; j--){
                System.out.print("*");
            }System.out.println();
        }
        System.out.println();
        
       //Terceira forma
       for(int i = 0; i < 10; i++){
           for(int j = 10; j > i; j--){
               System.out.print("*");
           }System.out.println();
           for(int k = 0; k < (i+1); k++){
               System.out.print(" ");
           }
       }
       System.out.println();
       
       //Quarta forma
       for(int i = 0; i < 10; i ++){
           for(int k = 0; k < (9 - i); k++){
               System.out.print(" ");
           }
           for(int j = 0; j < (i+1); j++){
               System.out.print("*");
           }System.out.println();
       }
    }
