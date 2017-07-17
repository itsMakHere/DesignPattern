package com.calc.factory;

import java.util.Scanner;

public class CalculatorDemo {
	
	public static void calculateResult(CalculatorFactory cf, String s, Scanner sc,Expression e){

		System.out.println("What type of calculator you want to use :\n"
				+ "1 : Standard Calulator \n"
				+ "2 : Scientific Calculator");
		int calculatorChoice = sc.nextInt();
		switch(calculatorChoice){
		case 1 : 
			Calculator c = cf.getCalculatorType("normalcalculator");
			s = s.replaceAll("[()]", "");
			System.out.println("Normal Calculator :  Result is  :- "+c.calculate(s));
			break;
		case 2:
			c = cf.getCalculatorType("scientificcaclulator");
			System.out.println("Scientific Calculator :  Result is  :- "+c.calculate(s));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Would you like to save this expression?(Y/N)");
		char saveExpr =  sc.next().charAt(0);
		switch(saveExpr){
		case 'Y':
		case 'y':
			e.save(s);
			System.out.println("Expression saved successfully");
		}
	}

	public static void main(String[] args) {
//			String s = "50+2*7";
		Expression e = new Expression();
		CalculatorFactory cf = new CalculatorFactory();
		char choice = 'Y';
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("1 : Enter Expression \n"
		
				+ "2 : Restore Saved Expression \n"
				+ "3 : Exit \n");
			switch(sc.nextInt()){
			case 1:
				System.out.println("Enter Expression");
				String s = sc.next();
				CalculatorDemo.calculateResult(cf,s,sc,e);
				break;
			case 2:
				String s1 = e.restore();
				if(s1 != null){
					System.out.println("Restored Expression is :- "+s1);
					CalculatorDemo.calculateResult(cf,s1,sc,e);
				}else{
					System.out.println("No expression to restore");
				}
				break;
			case 3:
				choice =  'N';
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}while('Y' == choice || 'y' == choice);

	}

}
