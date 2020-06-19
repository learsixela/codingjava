package com.oop.advanced.calculator1;

public class Calculadora {
		private double resultado;
		private double num1;
		private double num2;
		private char operador; 
		
		public Calculadora() {
			
		}
		public void setNum1(double input) {
			this.num1 = input;
		}
		public void setNum2(double input) {
			this.num2 = input;
		}
		public void setOperador(char input) {
			this.operador = input;
		}
		public void operacion() {
			if( this.operador == '+') {
				resultado = (num1) + (num2);
			}
			if( this.operador == '-') {
				resultado = (num1) - (num2);
			}
		}
		public void obtenerResultado() {
			System.out.println("El resultado de la " + operador + " es: "+resultado);
		}
	}
