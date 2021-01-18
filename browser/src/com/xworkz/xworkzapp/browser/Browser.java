package com.xworkz.xworkzapp.browser;

import java.util.Date;

public class Browser {

	public String name;
	public String speed;

	public Browser() {
		System.out.println("Browser constructor");
	}

	 public void toBrowse() {
		Date date = new Date();
		System.out.println(date);
		System.out.println("parentclass");
	}

}
