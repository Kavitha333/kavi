package com.xworkz;

import java.util.Scanner;

//import com.xworkz.pizza.PizzaHut;
import com.xworkz.pizza.PizzaHut;

public class PizzaHutUtil {
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the address");
		String address=sc.next();
		
		System.out.println("enter the type of pizza");
		String typeOfPizza=sc.next();
		
		System.out.println("enter the price");
		double price=sc.nextDouble();
		PizzaHut pizzahut = new  PizzaHut(address,typeOfPizza,price);
		System.out.println(pizzahut.address);
		System.out.println(pizzahut.typeOfPizza);
		System.out.println(pizzahut.price);
		sc.close();
		// PizzaHut pizzahut = new  PizzaHut("vijayanagar","Farmerspick",499.00);
		//System.out.println(pizzahut.address);
	}

}
