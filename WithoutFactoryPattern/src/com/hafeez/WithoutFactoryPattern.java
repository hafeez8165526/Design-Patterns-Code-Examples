package com.hafeez;

import java.util.Scanner;

import com.hafeez.entity.PizzaMaker;
import com.hafeez.entity.PizzaShop;

public class WithoutFactoryPattern {
	public static void main(String[] args) {
		System.out.println("Heyyyyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("What type of pizza do you want mr looser");
		String input=sc.nextLine();
		PizzaMaker s = new PizzaMaker();
		PizzaShop res=s.orderPizza(input);
		System.out.println(res.prepare());
		System.out.println(res.bake());
		System.out.println(res.cut());
		System.out.println(res.box());



		
		

	}
}
