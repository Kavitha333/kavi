package com.xworkz;

import com.xworkz.television.Television;

public class TelevisionUtil {

	

		
		public static void main(String a[]) {
			
			Television t=new Television();
			t.setName("onida");
			t.setBrand("Tv");
			t.setChannel("z");
			t.setPrice(100000.00);
			System.out.println(t.getName()+"\n"+t.getBrand()+""+t.getChannel()+""+t.getPrice());
		
		}

	}


