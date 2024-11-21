package com.hafeez.entity;

public class Espresso extends Drink{
	double espressoCost;
	public Espresso(String desc,String milk,String soy,String mocha,String whip,double cost) {
		super(desc, milk, soy, mocha, whip);
		espressoCost=cost;
	}

	@Override
	public double calculateCost() {
		return espressoCost+getCost();
	}
	

}
