package com.xworkz.xworkzapp.fruit;

public class Mango extends Fruit {

	public Mango() {
		System.out.println(" mango fruit constructor is created");
	}

		@Override
	public void feelingHappy() {
		System.out.println("fav fruit is mango");
		super.feelingHappy();
	}

}
