package com.hafeez.entity;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public class PlasticDuck extends Duck implements QuackBehaviour {

	public void Quack() {
		System.out.println("I am Plastic Duck.. Squeak Squeak");
	}

	public PlasticDuck(FlyBehaviour f,QuackBehaviour q) {
		super(f,q);
	}
	public PlasticDuck() {
	}
}
