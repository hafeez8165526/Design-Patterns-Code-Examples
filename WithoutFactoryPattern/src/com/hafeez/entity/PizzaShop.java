package com.hafeez.entity;

public abstract class PizzaShop {
	public abstract String prepare();
	public abstract String bake();
	public abstract String cut();
	public abstract String box();
	public PizzaShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PizzaShop orderPizza(String type) {
		if(type.equalsIgnoreCase("Cheese")) return new CheesePizza();
		else if(type.equalsIgnoreCase("Macoroni")) return new MacoroniPizza();
		else if(type.equalsIgnoreCase("Chicken")) return new ChickenPizza();
 		return new MacoroniPizza();
	}
	


}
