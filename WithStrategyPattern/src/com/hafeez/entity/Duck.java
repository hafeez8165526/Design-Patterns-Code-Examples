package com.hafeez.entity;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour fly;
	QuackBehaviour quack;

	public void swimm() {
		System.out.println("I am swimming........");
	}
	public Duck(FlyBehaviour fly,QuackBehaviour q) {
		this.fly=fly;
		this.quack=q;
	}
	public Duck() {
	}
//
	public void performFly() {
		if(fly!=null)
			fly.fly();
	}

	public void setFly(FlyBehaviour fly) {
		this.fly = fly;
	}
	public void setQuack(QuackBehaviour quack) {
		this.quack = quack;
	}
	public void performQuack() {
		if(quack!=null)
			quack.Quack();
	}

}
