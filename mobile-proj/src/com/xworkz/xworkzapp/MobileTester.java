package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.mobile.Mobile;

public class MobileTester {
	public static void main(String[] args) {

		Mobile m = new Mobile();
		m.setMobileId(11);
		m.setName("vivo");
		System.out.println(m);
		System.out.println(m.toString());

		Mobile o = new Mobile();
		o.setMobileId(12);
		o.setName("vivo");
		System.out.println(o);

		Mobile b = new Mobile();
		b.setMobileId(188);
		b.setName(" ");
		System.out.println(b);

		System.out.println(m.hashCode());
		System.out.println(o.hashCode());
		System.out.println(b.hashCode());

		
		  
		Object a="aaa";
		  System.out.println(m.getName().equals(b.getName()));
		  System.out.println(o.equals(a));
		  System.out.println(b.equals(m));
		 
	}

}
