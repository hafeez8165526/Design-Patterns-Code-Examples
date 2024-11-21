package com.hafeez.decorators;

import com.hafeez.entity.Drink;

public class Whip extends TopingMachine{
	Drink drink;

	public Whip(Drink drink) {
		super();
		this.drink = drink;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+","+"Whip";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return drink.getCost()+20.0;
	}
}
