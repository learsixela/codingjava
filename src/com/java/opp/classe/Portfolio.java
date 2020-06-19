package com.java.opp.classe;

import java.util.ArrayList;

public class Portfolio {

	ArrayList<Project> projects = new ArrayList<Project>();
	
	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public Portfolio() {
		
	}

	public Double getPortfolioCost() {
		Double portfolioCost = 0D;
		for (int i = 0; i < projects.size(); i++) {
			portfolioCost =  portfolioCost + projects.get(i).getInitialCost();
		}
		return portfolioCost;
	}
	
	public void showPortfolio() {
		//Agregar el método showPortfolio que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
		
		for (int i = 0; i < projects.size(); i++) {
			System.out.println(projects.get(i).getNombre()+"("+projects.get(i).getInitialCost()+")=:"+projects.get(i).getDescripcion());
		}
	}
}
