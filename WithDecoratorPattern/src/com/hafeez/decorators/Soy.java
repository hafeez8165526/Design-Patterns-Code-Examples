package com.hafeez.decorators;

import com.hafeez.entity.Drink;

public class Soy extends TopingMachine{
	Drink drink;

	public Soy(Drink drink) {
		super();
		this.drink = drink;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+","+"Soy";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return drink.getCost()+40.0;

	}
}
