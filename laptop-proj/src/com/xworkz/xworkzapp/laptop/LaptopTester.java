package com.xworkz.xworkzapp.laptop;

public class LaptopTester {
	public static void main(String[] args) {
		
	
	Laptop l=new Laptop();
	l.setName("hp");
	l.setPrice(320000.00);
	
	Laptop a=new Laptop();
	a.setName("del");
	a.setPrice(320000.00);
	
	Laptop p=new Laptop();
	p.setName("hp");
	p.setPrice(320000.00);
	
	Laptop t=new Laptop();
	t.setName("hp");
	t.setPrice(320000.00);
	System.out.println(l+"\n" + a+"\n"+p +"\n"+t);
	
	
	Object s="ff";
	System.out.println(t.equals(s));
	}
}
