package com.hafeez;

import com.hafeez.decorators.Milk;
import com.hafeez.decorators.Whip;
import com.hafeez.entity.DarkRoast;
import com.hafeez.entity.Drink;
import com.hafeez.entity.Espresso;

public class WithDecoratorPattern {
	public static void main(String[] args) {
		System.out.println("Heyyyyyy");
		Drink d1=new DarkRoast();
		System.out.println(d1.getDescription()+" cost: "+d1.getCost());
		Drink d2=new Espresso();
		System.out.println(d2.getDescription()+" cost: "+d2.getCost());
		
		Drink darkRoastMilkWhip=new DarkRoast();
		darkRoastMilkWhip=new Milk(darkRoastMilkWhip);
		darkRoastMilkWhip=new Milk(darkRoastMilkWhip);
		darkRoastMilkWhip=new Whip(darkRoastMilkWhip);
		
		System.out.println(darkRoastMilkWhip.getDescription()+" cost: "+darkRoastMilkWhip.getCost());

	}
}
