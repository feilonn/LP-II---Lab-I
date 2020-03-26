import java.util.Scanner;
import java.util.Locale;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        int testa;
        System.out.println("Deseja iniciar o cadastro de reembolso? [1-Sim/0-Não]: ");
        testa = input.nextInt();
        
        int[] quantidades = {0,0,0,0,0};
        double[] totalFinal = {0,0,0,0,0};
        
        int numProd, qtde;
        double prodUm = 2.98, prodDois = 4.50, prodTres = 9.98, prodQuatro = 4.49, prodCinco = 6.87;
        
        while(testa != 0){    
            System.out.println("Informe o numero do produto vendido[1, 2, 3, 4 ou 5]: ");
            numProd = input.nextInt();
            
            switch(numProd){
                
                case 1:
                    System.out.println("Informe a quantidade vendida desse produto: ");
                    qtde = input.nextInt();
                    quantidades[0] += qtde;
                    totalFinal[0] += (prodUm * qtde);
                    break;
                
                case 2:
                    System.out.println("Informe a quantidade vendida desse produto: ");
                    qtde = input.nextInt();
                    quantidades[1] += qtde;
                    totalFinal[1] += (prodDois * qtde);
                    break;
                
                case 3:
                    System.out.println("Informe a quantidade vendida desse produto: ");
                    qtde = input.nextInt();
                    quantidades[2] += qtde;
                    totalFinal[2] += (prodTres * qtde);
                    break;
                
                case 4:
                    System.out.println("Informe a quantidade vendida desse produto: ");
                    qtde = input.nextInt();
                    quantidades[3] += qtde;
                    totalFinal[3] += (prodQuatro * qtde);
                    break;
                
                case 5:
                    System.out.println("Informe a quantidade vendida desse produto: ");
                    qtde = input.nextInt();
                    quantidades[4] += qtde;
                    totalFinal[4] += (prodCinco * qtde);
                    break;
                    
                default:
                    System.out.print("Produto nao encontrado. Por favor insira um número válido!");
                    break;
            }
            
            System.out.println("Deseja continuar o cadastro de reembolso?[1-Sim/0-Não]");
            testa = input.nextInt();
        }
               
        System.out.println("=========================================================================");
        for(int i = 0; i < 5; i ++){
            System.out.println("Foram reembolsados "+quantidades[i]+" produtos de codigo "+(i+1)+", no valor de R$"+totalFinal[i]);
        }
    }
