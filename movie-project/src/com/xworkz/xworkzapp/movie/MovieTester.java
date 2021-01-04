package com.xworkz.xworkzapp.movie;

public class MovieTester {
	public static void main(String[] args) {
		
		Movie m=new Movie();
		System.out.println("implicit representation");
		m.setDirName("Rajendra Singh");
		m.setHeroName("vishnuvardhan");
		m.setMovieName("bandhana");
		System.out.println(m);
		
		Movie o=new Movie();
		o.setDirName("RakshithShetty");
		o.setHeroName("rakshith");
		o.setMovieName("kirikparty");
		System.out.println(o);
		
		Movie v=new Movie();
		v.setDirName("puttanakanagal");
		v.setHeroName("vishnuvardhan");
		v.setMovieName("Nagarahaavu");
		System.out.println(v);
		
		Movie i=new Movie();
		i.setDirName("RishibShetty");
		i.setHeroName("rakshith");
		i.setMovieName("Ricky");
		System.out.println(i);
		
		System.out.println("Explicit representation");
		System.out.println(m.toString());
		System.out.println(o.toString());
		System.out.println(v.toString());
		System.out.println(i.toString());
		
		System.out.println(" using hashcode (it hold the address)");
		System.out.println(m.hashCode());
		System.out.println(o.hashCode());
		System.out.println(v.hashCode());
		System.out.println(i.hashCode());
		
		System.out.println(m.equals(i));
		
		
		
		
	}

}
