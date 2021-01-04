package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.human.Human;

public class HumanTester {
	public static void main(String[] args) {
		System.out.println("implicit toString");
		Human avatar = new Human();
		avatar.setAdharNumber(101);
		avatar.setAge(3);
		avatar.setName("Avatar");
		System.out.println(avatar);

		Human agastya = new Human();
		agastya.setAdharNumber(103);
		agastya.setAge(23);
		agastya.setName("agastya");
		System.out.println(agastya);

		Human sneha = new Human();
		sneha.setAdharNumber(105);
		sneha.setAge(38);
		sneha.setName("sneha");
		System.out.println(sneha);

		Human kavitha = new Human();
		kavitha.setAdharNumber(107);
		kavitha.setAge(21);
		kavitha.setName("kavitha");
		System.out.println(kavitha);

		Human rukku = new Human();
		rukku.setAdharNumber(109);
		rukku.setAge(25);
		rukku.setName("Rukku");
		System.out.println(rukku);

//explicit toString
		System.out.println("explicit toString");
		System.out.println(avatar.toString());
		System.out.println(agastya.toString());
		System.out.println(sneha.toString());
		System.out.println(kavitha.toString());
		System.out.println(rukku.toString());

//to get Unix number of particular object ,,,calculated inside the JVM

		System.out.println(kavitha.hashCode());
		System.out.println(rukku.hashCode());
		System.out.println(avatar.hashCode());
		System.out.println(sneha.hashCode());
		System.out.println(agastya.hashCode());

//it is been calculated using memory location like *31+1  
//hashcode never return memory location

//comparing
		System.out.println(avatar.equals(avatar));

	}
}
