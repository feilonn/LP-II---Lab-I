            import java.util.Scanner; //Importacao do Scanner
            
            // Lista 1 - Raul Correia - 2019018166
            //Obs: Inseri todos as questoes dentro de uma unica funcao main

			public static void main(String[] args){
			    Scanner input = new Scanner(System.in);
		        int tam;
		        
		        System.out.println("////////// PRIMEIRA QUESTAO //////////");
		        
				System.out.println("Informe o tamanho n: ");
				tam = input.nextInt();	
				
				System.out.println("////////// PRIMEIRA QUESTAO //////////");
			    int cont = 1, aux = 1;
			   
			    System.out.println("N      10*N    100*N    1000*N");
			    for(int i = 0; i < tam; i++){
			        for(int j = 0; j < 4; j++){
			            System.out.print(aux);
			            System.out.print("      ");
			            aux = aux * 10;
			        };
			        cont++;
			        aux = 1;
			        System.out.println();
			        aux = aux * cont;
			    };
			    System.out.println("////////// FIM PRIMEIRA QUESTAO //////////");

			    System.out.println();
				//QUESTÃO 02 - ALGORITMO:
			    
				System.out.println("////////// SEGUNDA QUESTAO //////////");
				int padrao;	
			    System.out.println("Informe o padrão: ");
			    padrao = input.nextInt();
			    
			    //QUESTÃO 02 - ALGORITMO:
			    
			    //Primeira forma
			    for(int i = 0; i < padrao; i++){
			        for(int j = 0; j < i+1; j++){
			            System.out.print("*");
			        }System.out.println();
			    }
			    System.out.println(); 
			    
			    //Segunda forma
			    for(int i = 0; i < padrao; i++){
			        for(int j = padrao; j > i ; j--){
			            System.out.print("*");
			        }System.out.println();
			    }
			    System.out.println();
			    
			   //Terceira forma
			   for(int i = 0; i < padrao; i++){
			       for(int j = padrao; j > i; j--){
			           System.out.print("*");
			       }System.out.println();
			       for(int k = 0; k < (i+1); k++){
			           System.out.print(" ");
			       }
			   }
			   System.out.println();
			   
			   //Quarta forma
			   for(int i = 0; i < padrao; i ++){
			       for(int k = 0; k < (padrao - i); k++){
			           System.out.print(" ");
			       }
			       for(int j = 0; j < (i+1); j++){
			           System.out.print("*");
			       }System.out.println();
			   }
			   System.out.println("////////// FIM SEGUNDA QUESTAO //////////");
				   
				   System.out.println();
				   //QUESTÃO 03 - ALGORITMO:
				   System.out.println("////////// TERCEIRA QUESTAO //////////");
				   int n;
				   
				   System.out.println("Informe n(impar): ");
				   n = input.nextInt();
				   
				   while(n % 2 == 0) {
				       System.out.println("Informe n(impar): ");
				       n = input.nextInt();
				   };
				   
				   double quebra = Math.ceil(n/2);
				   
				   for(int i = 0; i <= quebra; i++){
				       
				       for(int k = 0; k < quebra - i; k++){
				           System.out.print(" ");
				       };
				       
				       for(int j = 0; j < (1 + (i*2)); j++){
				           System.out.print("*");
				       };System.out.println();
				   };
				   
				   for(int i = 0; i <= quebra; i++){
				       for(int k = 0; k < (i+1); k++){
				           System.out.print(" ");
				       };
				       for(int j = 0; j < ((n - 2) - (i*2) ); j++){
				           System.out.print("*");
				       };System.out.println();
				   };

			};

