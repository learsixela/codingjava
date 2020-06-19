package com.opp.calculadora.a20200619;

import java.io.Serializable;

public class Auto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String spatente;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	public Auto(String spatente) {
		super();
		this.spatente = spatente;
	}
	
	public String getSpatente() {
		return spatente;
	}
	public void setSpatente(String spatente) {
		this.spatente = spatente;
	}


}
