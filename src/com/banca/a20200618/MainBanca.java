package com.banca.a20200618;

public class MainBanca {

	public MainBanca() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		// En el constructor, llamar al método privado anterior,
		//así cada usuario tendrá un número de cuenta de 10 dígitos aleatorios.
		
		//instancia de la clase
		BankAccount bankAccount = new BankAccount();
		
		//cuenta corriente
		bankAccount.depositoCCorriente(2020D);
		bankAccount.depositoCCorriente(1999D);
		//cuenta de ahorro
		bankAccount.depositoCAhorro(3456D);
		
		//retiros de dinero
		bankAccount.retiroDineroCCorriente(5000D);
		bankAccount.retiroDineroCCorriente(3000D);
		
		bankAccount.retiroDineroCAhorro(5000D);
		bankAccount.retiroDineroCAhorro(1000D);
		
		//consultar saldos totales
		bankAccount.saldosTotales();
	}

}
