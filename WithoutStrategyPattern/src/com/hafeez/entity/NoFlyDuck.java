package com.hafeez.entity;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public class NoFlyDuck extends Duck implements QuackBehaviour{


	public NoFlyDuck(FlyBehaviour f,QuackBehaviour q) {
		super(f,q);
	}
	public NoFlyDuck() {
	}
	

	@Override
	public void Quack() {
		System.out.println("I am nofly duck... Quack Quack!!");
	}

}
