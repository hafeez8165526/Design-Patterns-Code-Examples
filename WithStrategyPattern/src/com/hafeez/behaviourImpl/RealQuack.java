package com.hafeez.behaviourImpl;

import com.hafeez.behaviours.QuackBehaviour;

public class RealQuack implements QuackBehaviour {

	@Override
	public void Quack() {
		System.out.println("I am real duck... Quack Quack Quack!!!!");
	}

}
