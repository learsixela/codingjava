package com.java.opp.classe;

public class Project {

	private String nombre, descripcion;
	private Double initialCost=0D;
	
	
	public Double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(Double initialCost) {
		this.initialCost = initialCost;
	}
	//get y set
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//cosntructores
	public Project() {
		System.out.println(toString());
	}
	
	public Project(String nombre) {
		super();
		this.nombre = nombre;
		System.out.println(toString());
	}
	public Project(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		System.out.println(toString());
	}

	public Project(String nombre, Double initialCost) {
		super();
		this.nombre = nombre;
		this.initialCost = initialCost;
		System.out.println(toString());
	}
	
	public Project(String nombre, String descripcion, Double initialCost) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
		System.out.println(toString());
	}
	//metodo
	public String elevatorPitch() {
		return this.nombre+"("+this.initialCost+")=:"+this.descripcion;
	}
	
	@Override
	public String toString() {
		return "Project [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
