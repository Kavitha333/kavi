package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;

public class IceCreamUtil {
	
	public static void main(String[] args) {
		
		ButterScotch b=new ButterScotch();
		b.setCost(45.00);
		b.setType("cone");
		System.out.println(b.getCost()+"\n"+b.getType());
		
		
	}

}
