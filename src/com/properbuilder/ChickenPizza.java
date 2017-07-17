package com.properbuilder;

public class ChickenPizza extends NonVegPizza {

	@Override
	public int price() {
		return 60;
	}

	@Override
	public String name() {
		return "Chicken Pizza";
	}

	@Override
	public String size() {
		return "Medium Size";
	}
	

}
