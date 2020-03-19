import java.util.Locale;
import java.util.Scanner;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        int cont = 0;
        int usu, invertido, copia;
        
        System.out.println("Informe um inteiro de 5 digitos: ");
        usu = input.nextInt();
        copia = usu;
        
        while(cont != 5){
            while(copia > 0){
                copia = copia / 10;
                cont++;
            }
            if(cont != 5){
                System.out.println("Informe um inteiro de 5 digitos: ");
                usu = input.nextInt();
                copia = usu;
                cont = 0;
            }
        }
        
        copia = usu;
        invertido = 0;
        
        while(copia > 0){
            invertido *= 10;
            invertido += (copia % 10);
            copia /= 10;
        }
        
        if(invertido == usu){
            System.out.println("Esse inteiro é Palindromo");
        }else{
            System.out.println("Esse inteiro não é Palindromo");
        }
   }

