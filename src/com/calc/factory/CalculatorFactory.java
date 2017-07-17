package com.calc.factory;

public class CalculatorFactory {
	public Calculator getCalculatorType(String type){
		if("NormalCalculator".equalsIgnoreCase(type)){
			return new StandardCalculator();
		}else{
			return new ScientificCalculator();
		}
	}

}
