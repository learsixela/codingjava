package com.opp.calculadora.a20200619;

import java.io.Serializable;
import java.util.ArrayList;

public class Calculator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6762218106335228297L;
	
	//atributos
	ArrayList<String> arrayListOperadores = new ArrayList<String>();
	ArrayList<Double> arrayListNumeros = new ArrayList<Double>();
	
	private double OperandOne=0;
	private double OperandTwo=0;
	private String Operation= "";
	private double Result=0;
	private double Result1=0;
	
	//constructores
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	//set y get
	public double getOperandOne() {
		return OperandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public String getOperation() {
		return Operation;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		Operation = operation;
	}
	
	public double getResult() {
		return Result;
	}

	public void setResult(double result) {
		Result = result;
	}
	
	//metodos
	public void performOperation() {
		if(this.Operation.equals("+")) {
			this.setResult(this.OperandOne + this.OperandTwo);
		}else if(this.Operation.equals("-")) {	
			this.setResult(this.OperandOne - this.OperandTwo);
		}else if(this.Operation.equals("*")) {	
			this.setResult(this.OperandOne * this.OperandTwo);
		}else {
			if(this.OperandTwo==0) {
				System.out.println("No se puede dividir por cero");
			}else {
				this.setResult(this.OperandOne / this.OperandTwo);
			}
			
		}
	}
	//sobre carga del metodo
	public void performOperation(String operador) {
		System.out.println(operador);
		arrayListOperadores.add(operador);
		if (operador=="=" && arrayListNumeros.size() >= 2) {
			for (int i = 0; i < arrayListOperadores.size(); i++) {
				//multiplicacion
				if(arrayListOperadores.get(i).equals("*")) {
					this.setResult1(arrayListNumeros.get(i) * arrayListNumeros.get(i+1));
					Double resultado = arrayListNumeros.get(i) * arrayListNumeros.get(i+1);
					//arrayListOperadores.remove(i);
					arrayListNumeros.remove(i+1);
					arrayListNumeros.set(i,resultado);
					arrayListOperadores.set(i,".");
				}else if(arrayListOperadores.get(i).equals("/")) {
					
					if(arrayListNumeros.get(i+1)==0D) {
						System.out.println("No se puede dividir por cero");
					}else {
					this.setResult1(arrayListNumeros.get(i) / arrayListNumeros.get(i+1));
					Double resultado = arrayListNumeros.get(i) / arrayListNumeros.get(i+1);
					//arrayListOperadores.remove(i);
					arrayListNumeros.remove(i+1);
					arrayListNumeros.set(i,resultado);
					arrayListOperadores.set(i,".");
					}
					
				}
			}
			//solo suma y resta 67,7
			//ope 4 [+ * +=]
			//10.5 + 52.0 + 5,2

			for (int i = 0; i < arrayListOperadores.size(); i++) {
				if(arrayListOperadores.get(i).equals("+")) {
					if(arrayListNumeros.size()> i) {
						this.setResult1(arrayListNumeros.get(i) + arrayListNumeros.get(i+1));
						Double resultado = arrayListNumeros.get(i) + arrayListNumeros.get(i+1);
						//arrayListOperadores.remove(i);
						arrayListOperadores.set(i, ".");
						arrayListNumeros.set(i+1,0.0);
						arrayListNumeros.set(i,resultado);
					}
		
					
				}else if(arrayListOperadores.get(i).equals("-")) {
					this.setResult1(arrayListNumeros.get(i) - arrayListNumeros.get(i+1));
					Double resultado = arrayListNumeros.get(i) - arrayListNumeros.get(i+1);
					//arrayListOperadores.remove(i);
					arrayListNumeros.remove(i+1);
					arrayListNumeros.set(i,resultado);
					arrayListOperadores.set(i,".");
				}
			}
			System.out.println("resultado 1"+this.getResult1());
		}
	}
	
	public double getResult1() {
		return Result1;
	}

	public void setResult1(double result1) {
		Result1 = result1;
	}

	public void performOperation(Double valor) {
		System.out.println(valor);
		arrayListNumeros.add(valor);
	}
	public void performOperation(Integer valor) {
		System.out.println(valor);
	}
	
	
	public boolean validarNumero(String dato) {
		try {
			Integer.parseInt(dato);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	//result = var1 + var2 * var3

	
	
	
	
	

}
