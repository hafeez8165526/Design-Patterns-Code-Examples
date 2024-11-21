package com.hafeez;

import com.hafeez.entity.Decaf;
import com.hafeez.entity.Drink;
import com.hafeez.entity.Espresso;

public class WithoutDecoratorPattern {
	public static void main(String[] args) {
		System.out.println("Heyyyyyy");
		Drink d1=new Decaf("special","","","","",1000);
		d1.setMilk("milk");
//		d1.calculateExtraCost();
		System.out.println("Special Decaf cost with milk COst:"+d1.calculateCost());
		Drink d2=new Espresso("Normal","","","","",2000);
		d2.setMilk("milk");
		d2.setMocha("mocha");
//		d2.calculateCost();
		System.out.println("Normal Espresso cost with milk,mocha COst"+d2.calculateCost());

	}
}
