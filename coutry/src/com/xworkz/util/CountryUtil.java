package com.xworkz.util;

import com.xworkz.country.India;
import com.xworkz.country.Srilanka;

public class CountryUtil {
	public static void main(String[] a) {
		India c = new India(38,780," ");
		Srilanka d= new Srilanka(56, 378, " ");
//		c.noOfStates=38;
//		c.noOfLanguages=780;
//		c.capitals=" ";
		
		System.out.println(c.getNoOfStates()+"\n"+c.getNoOfLanguages()+"\n"+c.getCapitals());
		System.out.println(d.getNoOfStates()+"\n"+d.getNoOfLanguages()+"\n"+d.getCapitals());
		
	}

}
