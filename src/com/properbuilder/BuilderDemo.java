package com.properbuilder;

public class BuilderDemo {

	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		
		Meal m = mb.prepareVegMeal();
		System.out.println("Veg Meal");
		m.showItems();
		System.out.println("Total Cost : "+m.totalCost());
		
		m = mb.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		m.showItems();
		System.out.println("Total Cost : "+m.totalCost());
		

	}

}
