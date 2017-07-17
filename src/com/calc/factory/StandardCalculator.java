package com.calc.factory;

import java.util.Stack;

public class StandardCalculator implements Calculator {

	@Override
	public int calculate(String exp) {
		Stack<Integer> myStack = new Stack<Integer>();
		StringBuilder temp = new StringBuilder();
		char op = '+';
		int result;
		for(int i=0;i<exp.length();i++){
			if(exp.charAt(i) != '+' && exp.charAt(i) != '*'  && exp.charAt(i) != '-' && exp.charAt(i) != '/'){
				temp.append(exp.charAt(i));
			}else{
				if(!myStack.isEmpty()){
					result = myStack.pop() ;
					myStack.push(perfromOperation(op, result, Integer.valueOf(temp.toString())));
					temp.setLength(0);
				}else{
					myStack.push(Integer.valueOf(temp.toString()));
					temp.setLength(0);
					}
				op = exp.charAt(i);
			}
		}
		int finalResult = perfromOperation(op,myStack.pop(),Integer.valueOf(temp.toString()));
		
		return finalResult;
	}
	
	public int perfromOperation(char op,int first,int second){
		switch(op){
		case '+':
			return first+second;
		case '*':
			return first*second;
		case '/':
			return first/second;
		case '-':
			return first-second;
			default:
				return 0;
		}
	}
	
}
