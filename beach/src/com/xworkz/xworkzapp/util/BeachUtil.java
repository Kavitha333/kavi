package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.beach.Malpe;

public class BeachUtil  {
	public static void main(String[] a) {
		Malpe malpe=new Malpe("Udupi",5,56);
		System.out.println(malpe.place+" "+malpe.noOfCafe+" "+malpe.noOfBoats);  
		
		malpe.enjoy(5);
		
	}

}
