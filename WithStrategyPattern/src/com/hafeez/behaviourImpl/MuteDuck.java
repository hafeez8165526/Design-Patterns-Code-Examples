package com.hafeez.behaviourImpl;

import com.hafeez.behaviours.FlyBehaviour;
import com.hafeez.behaviours.QuackBehaviour;

public class MuteDuck implements QuackBehaviour {

	@Override
	public void Quack() {
		System.out.println("I am dummy duck... I cant' Quacl :(");
	}

}
