package com.hafeez.behaviourImpl;

import com.hafeez.behaviours.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I am dummy duck... I am flying with the help of Rocket!!");
	}

}
