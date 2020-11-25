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
			 /* throw me;ERRO DE COMPILAÇÃO AO EXECUTAR O COMANDO "THROW" PARA A VARIAVEL "me"
			 		  A CLASSE MAIN PRECISA TER A DECLARAÇÃO "THROWS MinhaExcecao" PARA
			 		  O CÓDIGO COMPILAR E EXECUTAR.*/
		}
		System.out.println("fim");
	}
}
