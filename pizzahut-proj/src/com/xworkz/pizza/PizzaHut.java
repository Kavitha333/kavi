package com.xworkz.pizza;

public class PizzaHut {

	//instance variables/attributes/state/properties
	public String address;
	public String typeOfPizza;
	public double price;
	
	public PizzaHut()
	{
		this("jayanagr","cornpizza",23);
		System.out.println("ending with zero param const");
	}
	
	public PizzaHut(String address , String typeOfPizza,double price) 
	{
		this.address=address;
		this.typeOfPizza=typeOfPizza;//purpose of this is used for point out local variable
		this.price=price;
	}
	public PizzaHut(double price)
	{
		this();
		System.out.println("inside one param const");
		System.out.println(this.price);
		this.price=price;
	}
	
}
