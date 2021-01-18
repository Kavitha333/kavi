package com.xworkz;

public class ChurchUtil {
	
public static void main(String[] a) {
	
	Church church= new Church("St.Josep's Church","Goa",43);
	
	
	/*church.setName("St.Josep's Church");
	*church.setAddress("Goa");
	*church.setNoOfFathersAndSisters(43);
	*/
	System.out.println(church.getName()+"\n"+church.getAddress()+"\n"+church.getNoOfFathersAndSisters());

	
	
}
}
