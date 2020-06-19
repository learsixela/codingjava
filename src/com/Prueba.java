package com;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		//Instanciando (llamando a la clase Scanner)
		Scanner scan = new Scanner(System.in);
		//definicion de variable; llamado a la clase, y al constructor
		Scanner scanner = new Scanner(System.in);
		
		//definiendo variables
		String sNumerica = "";
		Integer inNumericas = 0;
		
		//syso imprime en pantalla
		System.out.print("Hola ");
		System.out.println("Mundo!!");
		
		//ingreso y captura de datos
		int iEdad = 0;
		System.out.println("Ingrese su edad");//
		iEdad = scan.nextInt();
		
		System.out.println("la edad es: ");
		System.out.println(iEdad);
		
		//solicitando y capturando datos
		System.out.println("ingrese numero 1");
		int iNumero1 = scan.nextInt();
		System.out.println("Ingrese nuero 2");
		int iNumero2 = scan.nextInt();
		
		System.out.println(" La suma es:");
		System.out.println(iNumero1+iNumero2);
		
		System.out.println(" tipo string");
		String sTexto= scan.next();
		System.out.println(sTexto);
		
		
	}

}
