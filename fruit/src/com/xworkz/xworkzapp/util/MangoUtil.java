package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.fruit.Mango;

public class MangoUtil {

	public static void main(String[] args) {
		Mango fruit = new Mango();
		fruit.feelingHappy();
		fruit.fruitName = "mango";
		fruit.price = 100;

		System.out.println("fruit name is :" + fruit.fruitName + 
				"\n price : " + fruit.price);
	}

}
