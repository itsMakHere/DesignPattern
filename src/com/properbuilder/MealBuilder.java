package com.properbuilder;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal m = new Meal();
		m.addItems(new CheezePizaa());
		return m;
	}
	
	public Meal prepareNonVegMeal(){
		Meal m = new Meal();
		m.addItems(new ChickenPizza());
		return m;
	}

}
