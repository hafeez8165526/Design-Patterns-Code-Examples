package com.hafeez;

import com.hafeez.behaviourImpl.CantFly;
import com.hafeez.behaviourImpl.FlyWithRocket;
import com.hafeez.behaviourImpl.FlyWithWings;
import com.hafeez.behaviourImpl.MuteDuck;
import com.hafeez.behaviourImpl.PlasticDuckQuack;
import com.hafeez.behaviourImpl.RealQuack;
import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;
import com.hafeez.entity.Duck;
import com.hafeez.entity.NoFlyDuck;
import com.hafeez.entity.NormalDuck;
import com.hafeez.entity.PlasticDuck;

public class WithStrategyPattern {
	public static void main(String[] args) {
		System.out.println("Heyyyyyy");
		Duck normal= new NormalDuck();
		normal.setFly(new FlyWithWings());
		normal.setQuack(new RealQuack());
		normal.performQuack();
		normal.swimm();
		normal.performFly();
		Duck noflynoQuackDuck=new NoFlyDuck();
		noflynoQuackDuck.setQuack(new MuteDuck());
		noflynoQuackDuck.setFly(new CantFly());
		noflynoQuackDuck.performQuack();
		noflynoQuackDuck.swimm();
		noflynoQuackDuck.performFly();
		Duck plasticDuckWithRocket=new PlasticDuck();
		plasticDuckWithRocket.setQuack(new PlasticDuckQuack());
		plasticDuckWithRocket.setFly(new FlyWithRocket());
		plasticDuckWithRocket.performQuack();
		plasticDuckWithRocket.swimm();
		plasticDuckWithRocket.performFly();

	}
}
