package com.xworkz.xworkzapp.abstractionexample2;

public  class PhoneTester {
	public static void main(String[] args) {
		
//		MaheshPhone obj=new MaheshPhone();// can'nt instantiate the abstract class
//		obj.call();
		
		MaheshPhone obj=new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	}
}

 abstract class MaheshPhone //abstract class
 {
	public void call() {
		System.out.println("calling....");
	}
	public abstract void move();//abstract method
	public abstract void dance();
	public abstract void cook();
}

  abstract class RameshPhone extends MaheshPhone //concrete class
  {

	public void move() {
		System.out.println("Moving....");
	}
	 
 }
  
  class SureshPhone extends RameshPhone {
	  public void dance() {
		  System.out.println("dancing....");
	  }
	  public void cook() {
		  System.out.println("cooking...");
	  }
  }
