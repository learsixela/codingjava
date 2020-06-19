package com.oop.advanced.calculator1;

public class MainCalcualdora {
	   public static void main(String[] args) {
		   
		   //instancia de la clase
		   Calculadora calculadora = new Calculadora();
		   
		   //set de los numeros
		   calculadora.setNum1(80.5);
		   calculadora.setNum2(5.6);
		   
		   //set del operador
		   calculadora.setOperador('+');
		   
		   //llamado a la función que realizara la 
		   calculadora.operacion();
		   
		   //llamado a la funcion que mostrará el resultado
		   calculadora.obtenerResultado();
	    }
}
