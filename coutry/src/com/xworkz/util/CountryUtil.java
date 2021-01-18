package com.xworkz.util;

import com.xworkz.country.Country;
import com.xworkz.country.India;
import com.xworkz.country.Srilanka;

public class CountryUtil {
	public static void main(String[] a) {
	Country country=new Country( 0,2," ");
	country.NoOfLanguages=2;
		System.out.println(country.getNoOfStates()+"\n"+country.getNoOfLanguages()+"\n"+country.getCapitals());
		India c = new India(38,780," ");
		Srilanka d= new Srilanka(56, 378, " ");
		c.setNoOfStates(45);
		c.setNoOfLanguages(780);
		c.setCapitals(" k");
		
		System.out.println(c.getNoOfStates()+"\n"+c.getNoOfLanguages()+"\n"+c.getCapitals());
		System.out.println(d.getNoOfStates()+"\n"+d.getNoOfLanguages()+"\n"+d.getCapitals());
		
	}

}
