package com.xworkz.xworkzapp.browser;

import java.util.Date;

public class Firefox extends Browser {
	public Firefox() {
		super();
		System.out.println("Firefox Created");
	}

	public void toBrowse() {
		Date date = new Date();
		System.out.println(date);
		System.out.println("childclass");
		super.toBrowse();
	}

}
