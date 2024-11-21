package com.hafeez.entity;

// 1000
public class Decaf extends Drink{
	double decafCost;

	public Decaf(String desc,String milk,String soy,String mocha,String whip,double cost) {
		super(desc, milk, soy, mocha, whip);
//		setCost(cost);
		this.decafCost=cost;
		
	}

	@Override
	public double calculateCost() {
		
		return decafCost+getCost();
	}
	

}
