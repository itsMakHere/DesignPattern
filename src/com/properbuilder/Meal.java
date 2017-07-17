package com.properbuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items = new ArrayList<Item>();
	
	public void addItems(Item e){
		items.add(e);
	}
	
	public int totalCost(){
		int cost = 0;
		for(Item item : items){
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems(){
		for(Item item : items){
			System.out.print("Name : "+item.name());
			System.out.print(", Size : "+item.size());
			System.out.print(", Cost : "+item.price()+"\n");
			
		}
	}

}
