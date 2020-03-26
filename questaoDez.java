package treinoJava;

public class questaoDez{
    public static void main(String[] args){
        
        int ladoUm, ladoDois, hipotenusa;
        
        for(int i = 1; i <= 500; i++){
            ladoUm = i;
            for(int j = 1; j <= 500; j++){
                ladoDois = j;
                for(int k = 1; k <= 500; k++){
                    hipotenusa = k;
                    if((Math.pow(ladoUm, 2) + Math.pow(ladoDois, 2)) == Math.pow(hipotenusa, 2)){
                        System.out.println("-=-=-=-=-=-=Triângulo encontrado!=-=-=-=-=-=");
                        System.out.println("============================================");
                        System.out.println("Lado 1 = "+ladoUm+", Lado 2 = "+ladoDois+", Hipotenusa = "+hipotenusa);
                        System.out.println("============================================");
                        System.out.println();
                    }
                }
            }
        }
    }
}