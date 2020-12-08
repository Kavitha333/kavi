package com.xworkz;

import com.xworkz.televisionencapsulation.TelevisionEncapsulation;

public class TelevisionEncapsulationUtil {
	
public static void main(String[] a) {
	
	TelevisionEncapsulation t= new TelevisionEncapsulation("hp","z",120.00); 
			
			System.out.println(t.getName()+" "+ t.getChannel() +" "+ t.getPrice());
		
 		}

}

