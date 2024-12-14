package com.hafeez.entity;

public  class PizzaMaker {

	public PizzaShop orderPizza(String type) {
		if(type.equalsIgnoreCase("Cheese")) return new CheesePizza();
		else if(type.equalsIgnoreCase("Macoroni")) return new MacoroniPizza();
		else if(type.equalsIgnoreCase("Chicken")) return new ChickenPizza();
 		return new MacoroniPizza();
	}
	


}
