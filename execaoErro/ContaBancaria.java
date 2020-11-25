package execaoErro;

public class ContaBancaria {
	
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}
	
	public double getSaldoComLimite() {
		double saldoComLimite = 0;
		saldoComLimite = this.saldo + this.limite;
		System.out.println("Seu saldo junto do limite e de R$"+saldoComLimite);
		return saldoComLimite;
	}
	
	public boolean sacar(double valor) throws ContaException{
		if(valor >= 500) {
			throw new ContaException("Apenas sao permitidos saques menores que R$500");
		}else {
			if(valor <= this.saldo + this.limite) {
				this.saldo = this.saldo - valor;
				System.out.println("Você acabou de sacar R$"+valor);
				System.out.println("Saldo atual = R$"+this.saldo);
				System.out.println("Limite atual = R$"+this.limite);
				return true;
			}
		}
		
		if(valor > this.saldo + this.limite) {
			throw new ContaException("Saldo Insuficiente para o saque!");
		}
		return false;
	}
	
	public void depositar(double valor) throws ContaException{
		if(valor > 0 && valor <= 1000) {
			this.saldo = this.saldo + valor;
			System.out.println("Você acabou de depositar R$"+valor);
		}else {
			throw new ContaException("Nao e possivel fazer um deposito nesse valor!");
		}
		System.out.println("Saldo atual = R$"+this.saldo);
	}
	
}
