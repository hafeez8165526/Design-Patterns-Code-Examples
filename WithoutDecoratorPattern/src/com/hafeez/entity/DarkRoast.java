package com.hafeez.entity;

public class DarkRoast extends Drink{
	double darkRoastCost;
	public DarkRoast(String desc,String milk,String soy,String mocha,String whip,double cost) {
		super(desc, milk, soy, mocha, whip);
		darkRoastCost=cost;
	}

	@Override
	public double calculateCost() {
		return darkRoastCost+getCost();
	}
	

}
