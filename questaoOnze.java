package treinoJava;

public class questaoOnze{
    public static void main(String[] args){
        
        for(int i = 0; i < 5; i++){
            if(i <= 4){
                for(int k = 0; k < 4 - i; k++){
                    System.out.print(" ");
                }
            }
            for(int j = 0; j < (1 + (i*2)); j++){
                System.out.print("*");
            }System.out.println();
        }
        
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < (i+1); k++){
                System.out.print(" ");
            }
            for(int j = 0; j < (7 - (i*2) ); j++){
                System.out.print("*");
            }System.out.println();
        }
        
    }     
}


/*
public static void main(String[] args){
        
        for(int i = 0; i < 5; i++){
            if(i <= 4){
                for(int k = 0; k < 4 - i; k++){
                    System.out.print(" ");
                }
            }
            for(int j = 0; j < ((10 - (9 - i) ) + i ); j++){
                System.out.print("*");
            }System.out.println();
        }
        
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < (i+1); k++){
                System.out.print(" ");
            }
            for(int j = 0; j < (7 - (i*2) ); j++){
                System.out.print("*");
            }System.out.println();
        }
        
    }
*/