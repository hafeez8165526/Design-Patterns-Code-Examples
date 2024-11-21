package com.hafeez.behaviourImpl;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public class PlasticDuckQuack implements QuackBehaviour {

	@Override
	public void Quack() {
		System.out.println("I am plastic duck... Squeak Squeak");
	}

}
