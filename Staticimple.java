package com.xworkz;

public class Staticimple {
	
	
	public static void main(String[] args) {
		
		Staticimple s=new Staticimple();
		s.ss();
	}
	int c;
	public static void ss() {
	 int i=0; //we can't declare static variable inside the method or static method.
	 Staticimple s=new Staticimple();
	 s.c=6;
	//we can'nt declare instance variable inside the static method or non static method
		//local variable can declare inside the static or non  static method.
	int j=19;
	System.out.println(j);
	}

}
