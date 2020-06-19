package com.opp.calculadora.a20200619;

public class MiMain {

	public static void main(String[] args) {
		
		//Nombre de la clase (Calculator)
		//variable de referencia (calc)
		//Reservar un espacio de memoria (new)
		//llamado al constructor (Calculator())
		/*
		Calculator calc =  new Calculator();
		
		calc.setOperandOne(10.5);
		calc.setOperation("-");
		calc.setOperandTwo(5.2); 
		calc.performOperation();
		
		System.out.println("donde el resultado debe ser "+calc.getResult());

		calc.performOperation(10.5);
		calc.performOperation("+");
		calc.performOperation(5.2);
		calc.performOperation("*");
		calc.performOperation(10D);
		calc.performOperation("+");
		calc.performOperation(5.2);
		calc.performOperation("=");
		*/
		//System.out.println(calc.getResult1());
		
		//crear 2 arraylist 1 numeros y 1 para operadores ok ok
		
		//for recorremos operadores, al poner poner operador = y si hay mas de 2 numeros
		
		//if validamos las prioridades de los operadores ok
		
		//con el indice del operador , busco los numeros continuos
		//guardar resultado indice i de resultados, se remueven datos utilizados
		
		
		
Calculator2 c = new Calculator2();
		
		c.performOperation(10.5);
		c.performOperation("+");
		c.performOperation(5.2);
		c.performOperation("*");
		c.performOperation(10);
		/*c.performOperation("+");
		c.performOperation(5.2);*/
		c.performOperation("=");
		c.getResults();
		
	}

}
