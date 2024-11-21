package com.hafeez;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;
import com.hafeez.entity.Duck;
import com.hafeez.entity.NoFlyDuck;
import com.hafeez.entity.NormalDuck;
import com.hafeez.entity.PlasticDuck;

public class WithoutStrategyPattern {
	public static void main(String[] args) {
		System.out.println("Heyyyyyy");
		Duck normal= new NormalDuck();
		FlyBehaviour normalFly=new NormalDuck();
		QuackBehaviour normalQuack=new NormalDuck();
		normal.setFly(normalFly);
		normal.setQuack(normalQuack);
		normal.performQuack();
		normal.swimm();
		normal.performFly();
		Duck noflyDuck=new NoFlyDuck();
		QuackBehaviour noflyQuack=new NoFlyDuck();
		noflyDuck.setQuack(noflyQuack);
		noflyDuck.performQuack();
		noflyDuck.swimm();
		noflyDuck.performFly();
		Duck plastic=new PlasticDuck();
		QuackBehaviour plasticDuckQuack=new PlasticDuck();
		plastic.setQuack(plasticDuckQuack);
		plastic.performQuack();
		plastic.swimm();
		plastic.performFly();

	}
}
