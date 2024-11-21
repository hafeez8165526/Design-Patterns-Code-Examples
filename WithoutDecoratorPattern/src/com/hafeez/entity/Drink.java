package com.hafeez.entity;

public abstract class Drink {
	String description;
	// 100
	String milk;
	//200
	String soy;
	//300
	String mocha;
	// 400
	String whip;
	
	double cost;
	



	public Drink(String description, String milk, String soy, String mocha, String whip) {
		super();
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
//		this.cost=cost();
//		calculateExtraCost();
	}



	public double calculateCost() {
		cost=(milk.isEmpty()?100:0)+(!soy.isEmpty()?200:0)+(!mocha.isEmpty()?300:0)+(!whip.isEmpty()?400:0);
		return cost;
	}
	
	
	
	public String getMilk() {
		
		return milk;
	}



	public void setMilk(String milk) {
		this.milk = milk;
		cost+=!milk.isEmpty()?100:0;
	}



	public String getSoy() {
		return soy;
	}



	public void setSoy(String soy) {
		this.soy = soy;
		cost+=!soy.isEmpty()?200:0;
	}



	public String getMocha() {
		return mocha;
	}



	public void setMocha(String mocha) {
		this.mocha = mocha;
		cost+=!mocha.isEmpty()?300:0;
	}



	public String getWhip() {
		return whip;
	}



	public void setWhip(String whip) {
		this.whip = whip;
		cost+=!whip.isEmpty()?400:0;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDescription() {
		return description;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
