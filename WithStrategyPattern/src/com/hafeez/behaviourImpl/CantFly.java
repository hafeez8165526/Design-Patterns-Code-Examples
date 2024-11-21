package com.hafeez.behaviourImpl;

import com.hafeez.behaviours.FlyBehaviour;

public class CantFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I am dummy duck... I cant Fly!!");
	}

}
