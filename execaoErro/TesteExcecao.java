package execaoErro;

class MinhaExcecao extends Exception{
	
}

public class TesteExcecao {
	public static void teste() throws MinhaExcecao{
		throw new MinhaExcecao();
	}
	
	public static void main(String[] args){
		MinhaExcecao me = null;
		try {
			System.out.println("try");
			teste();
		} catch(MinhaExcecao e){
			System.out.println("catch");
			me = e;
		} finally{
			System.out.println("finally");
			 /* throw me;ERRO DE COMPILA��O AO EXECUTAR O COMANDO "THROW" PARA A VARIAVEL "me"
			 		  A CLASSE MAIN PRECISA TER A DECLARA��O "THROWS MinhaExcecao" PARA
			 		  O C�DIGO COMPILAR E EXECUTAR.*/
		}
		System.out.println("fim");
	}
}
