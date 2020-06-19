package com.java.opp.classe;

import java.util.ArrayList;

public class MainClase {

	public static void main(String[] args) {
	
		//muchos pojects
		ArrayList<Project> projects = new ArrayList<Project>();
		Portfolio portafolio = new Portfolio();	
		
		Project p1 = new Project();
		Project p2 = new Project("oficina");
		Project p3 = new Project("electrones","para el estudio de la fisica");
		Project p4 = new Project("Electrico",1000000D);
		Project p5 = new Project("Informatica"," Los nerd de la empresa",1000000D);
		
		projects.add(p1);
		projects.add(p2);
		projects.add(p3);
		projects.add(p4);
		projects.add(p5);
		
		portafolio.setProjects(projects);
		
		Double costoTotal= portafolio.getPortfolioCost();
		
		System.out.println("El costo total es: "+ costoTotal);
		
		portafolio.showPortfolio();
		
		Portfolio portafolio2 = new Portfolio();
		
		portafolio2.setProjects(projects);
	}	
}
