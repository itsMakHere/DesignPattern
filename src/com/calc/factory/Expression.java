package com.calc.factory;

public class Expression {
	private String expression;
	
	public void save(String expression){
		this.expression = expression;
	}
	
	public String restore(){
		return expression;
	}

}
