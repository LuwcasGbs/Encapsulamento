package Aula18_09;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		//Saldo inicial
		System.out.println(conta.getSaldo());
		
		//depósitos
		conta.depositar(500);
		conta.depositar(1000);
		
		//mostrar saldo após 2 depósitos
		System.out.println(conta.getSaldo());
		
		//saque
		conta.sacar(1500);
		
		//mostrar após saque
		System.out.println(conta.getSaldo());
	}

}
