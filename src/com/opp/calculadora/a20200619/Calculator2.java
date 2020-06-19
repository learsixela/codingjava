package com.opp.calculadora.a20200619;

import java.util.ArrayList;

public class Calculator2 {

    ArrayList<String> operators = new ArrayList<String>();
    ArrayList<Double> nums = new ArrayList<Double>();
    Double results;
    
	public Calculator2() {

	}
	//sobre carga de metodo
	public void performOperation(double dub){
        nums.add(dub);
    }
	//int a double
    public void performOperation(int dub){
        nums.add((double)dub);
    }
    public void performOperation(String str){
        if (!str.equals("=")){
            operators.add(str);
        }
        else {
            Double start = nums.get(nums.size()-1);
            for(int i = operators.size()-1; i >=0; i--){
                switch(operators.get(i)){
                    case "+": start = start + nums.get(i); break;
                    case "-": start = start - nums.get(i); break;
                    case "*": start = start * nums.get(i); break;
                    case "/": start = start / nums.get(i); break;
                    default: System.out.println("Invalid operator."); break;
                }
            }
            this.results = start;
        }
    }
    public void getResults(){
        System.out.println(this.results);
    }

}
