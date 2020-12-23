package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.Watch;

public class RolexUtil {

	public static void main(String[] a) {

		Rolex watch = new Rolex(); // upcasting,polymorphism
		// Rolex rolex = new Watch(); //down casting (directlty it cant posiible)
		Rolex rolex = (Rolex) watch;// first upcasting then we can do down casting
		// Rolex rolex=(Rolex) new Watch(); here we getting error ....but one way to
		// create the downcasting
		watch.modelNo = "RT420";
		watch.price = 5678.99;
		watch.displayTime();
		System.out.println(watch.modelNo + "\n" + watch.price);
	}
}
//same functionality in both parent class and child class but implementation is change.