package com.banca.a20200618;

public class BankAccount {
	//definir atributos
	private String sNumeroCuenta;
	private Double dSaldoCuentaCorriente = 0D;
	private Double dSaldoCuentaAhorro = 0D;
	public static int iNumeroCuentasCreadas;
	public static double dCantidadDineroAlmacenado;
	
	//constructor vacio
	public BankAccount() {
		obtenerNumeroCuenta();
		this.iNumeroCuentasCreadas += 1;
		System.out.println("incremento "+this.iNumeroCuentasCreadas);
		//this.iNumeroCuentasCreadas = this.iNumeroCuentasCreadas +1;
	}
	//set y get

	//metodos
	//Crear un método privado que retorne un número de 10 dígitos aleatorios para el número de cuenta.
	
	private Double obtenerNumeroCuenta() {
		Double dNumeroCuenta = Math.floor((Math.random()*1000000000)+1);
		System.out.println(dNumeroCuenta);
		System.out.println(this.iNumeroCuentasCreadas);
		return dNumeroCuenta;
	}

	public Double getdSaldoCuentaCorriente() {
		return dSaldoCuentaCorriente;
	}

	public Double getdSaldoCuentaAhorro() {
		return dSaldoCuentaAhorro;
	}


//Crear un método que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, 
	//asegúrese de aumentar el total de dinero almacenado.
	
	public void depositoCCorriente(Double dinero) {
		System.out.println("this.dSaldoCuentaCorriente 1:" + this.dSaldoCuentaCorriente);
		this.dSaldoCuentaCorriente+=dinero;
		System.out.println("this.dSaldoCuentaCorriente 2:" + this.dSaldoCuentaCorriente);
		
	}
	
	public void depositoCAhorro(Double dinero) {
		this.dSaldoCuentaAhorro = this.dSaldoCuentaAhorro + dinero;
		System.out.println("Deposito cuenta de ahorro: "+this.dSaldoCuentaAhorro);
	}
	//Crear un método para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
	
	public void retiroDineroCCorriente(Double dinero) {
		//solo en el caso de que sea menor o igual se puede hacer retiro de dinero
		if(this.dSaldoCuentaCorriente >= dinero) {
			this.dSaldoCuentaCorriente = this.dSaldoCuentaCorriente - dinero;
			System.out.println("El saldo de al CC es: "+this.dSaldoCuentaCorriente);
		}else {
			System.out.println("Saldo insuficiente");
		}

	}
	
	public void retiroDineroCAhorro(Double dinero) {
		if(this.dSaldoCuentaAhorro >= dinero) {
			this.dSaldoCuentaAhorro = this.dSaldoCuentaAhorro - dinero;
			System.out.println("El saldo de al C Ahorro es: "+this.dSaldoCuentaAhorro);
		}else {
			System.out.println("Saldo insuficiente cuenta Ahorro");
		}
	}
	
	//Crear un método para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
	public void saldosTotales() {
		System.out.println("********");
		System.out.println("El saldo de al CC es: "+this.dSaldoCuentaCorriente);
		System.out.println("El saldo de al C Ahorro es: "+this.dSaldoCuentaAhorro);
	}
	
}







