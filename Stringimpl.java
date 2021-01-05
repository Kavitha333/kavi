package com.xworkz;

public class Stringimpl {
	public static void main(String[] args) {
		// using literals
		System.out.println("using String type of data ");
		String a = "kavitha";
		// System.out.println(a);
		String b = "kavitha";
		System.out.println(a);

		if (a == b)
			System.out.println("true");
		else
			System.out.println("false");

		if (a.equals(b)) // a and b values are same
			System.out.println("true");
		else
			System.out.println("false");

		a = "kavitha1";
		if (a == b)
			System.out.println("true");
		else
			System.out.println("false");

		if (a.equals(b)) // a and b values are different
			System.out.println("true");
		else
			System.out.println("false");

		System.out.println("using interger type of data");
		int c = 1;
		int d = 1;
		if (c == d)
			System.out.println("true");
		else
			System.out.println("false");
		// can'nt invoke equals(int) on primitive type int
		/*
		 * if(c.equals(d)) System.out.println("true"); else System.out.println("false");
		 */
		System.out.println("\nusing new keyword");
		String s1 = "kavi";
		String s = new String("kavi");
		System.out.println(s);
		if (s1 == s) // s1 and s values are same but address is different 
			System.out.println("true");
		else
			System.out.println("false");

		if (s1.equals(s)) // s1 and s values are same  
			System.out.println("true");
		else
			System.out.println("false");

		System.out.println("s2 and s4 new created object for both");
		String s2 = new String("savii");
		String s4 = new String("savii");

		if (s2 == s4)
			System.out.println("true");
		else
			System.out.println("false");

		if (s2.equals(s4)) // s1 and s values are different
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("\nusing stringbuffer");
		StringBuffer b1=new StringBuffer("puchu");
		System.out.println(b1);
		b1.append("k");
		System.out.println(b1);
		b1.append("L");
		System.out.println(b1);
		
		System.out.println("\n using stringbuffer");
		StringBuffer b2=new StringBuffer("puchu");
		System.out.println(b2);
		b2.append("k");
		System.out.println(b2);
		b2.append("L");
		System.out.println(b2);
		
		System.out.println("\nb1==b2");//different location
		if(b1==b2)
			System.out.println("true");
		else
			System.out.println("false");
		
		//doubt...... answer is false why?
		System.out.println("b1.equals(b2)");//Assign value are same in both the variable
		if(b1.equals(b2))
			System.out.println("true");
		else
			System.out.println("false");
			
	}

}
