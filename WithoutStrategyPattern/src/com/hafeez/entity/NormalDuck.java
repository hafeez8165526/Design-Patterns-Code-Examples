package com.hafeez.entity;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public class NormalDuck extends Duck implements FlyBehaviour, QuackBehaviour {


	public NormalDuck() {
		
	}

	public NormalDuck(FlyBehaviour fly, QuackBehaviour q) {
		super(fly, q);
	}

	@Override
	public void fly() {
		System.out.println("I am normal duck... I can fly!!");
	}

	public void Quack() {
		System.out.println("I am normal duck... Quack Quack!!");

	}

}
