package com.xworkz.xworkzapp.abstractionexample3;

public class IphoneTester {
	public static void main(String[] args) {

		Phone obj1 = new Samsung();
		show(obj1);
		Phone obj2 = new Iphone();
		show(obj2);
	}

	public static void show(Phone obj) {
		obj.showConfig();
	}

}

abstract class Phone {
	public abstract void showConfig();
	/*
	 * { System.out.println("2GB ram,IOs 9.3 version"); } }
	 */
}

class Iphone extends Phone {
	public void showConfig() {
		System.out.println("2GB ram,IOs 9.3 version");
	}
}

class Samsung extends Phone {
	public void showConfig() {
		System.out.println("2GB ,lollipop");
	}
}