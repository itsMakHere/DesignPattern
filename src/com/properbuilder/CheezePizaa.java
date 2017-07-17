package com.properbuilder;

public class CheezePizaa extends VegPizza {

	@Override
	public String size() {
		return "Normal Size";
	}

	@Override
	public int price() {
		return 50;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

}
