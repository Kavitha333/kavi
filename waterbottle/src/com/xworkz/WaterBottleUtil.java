package com.xworkz;

import com.xworkz.waterbottle.WaterBottle;

public class WaterBottleUtil {

	public static void main(String[] a) {
		
		WaterBottle w=new WaterBottle();
		w.setName("Blender bottle");
		w.setPrice(500);
		w.setBrand("STRAUSS");
		System.out.println("Bottle type  :"+ w.getName()+"\n Bottle price: "+w.getPrice()+"\n Brand name: "+w.getBrand());
		}
}
