package com.hafeez.decorators;

import com.hafeez.entity.Drink;

public class Milk extends TopingMachine {

	Drink drink;
	
	

	public Milk(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + "," + "Milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return drink.getCost() + 10.0;
	}

}
