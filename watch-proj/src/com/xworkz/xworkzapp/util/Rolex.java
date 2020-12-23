package com.xworkz.xworkzapp.util;

import java.util.Date;

import com.xworkz.xworkzapp.watch.Watch;

public class Rolex extends Watch {
	public Rolex() {
	super();
	System.out.println("Rolex created");
	}
	
	void displayTime() {
		Date date = new Date();
		System.out.println(date);
	}


}
