//package com.xworkz.Util;
//
//import com.xworkz.Reva;
//import com.xworkz.Vtu;
//
//public class UniversityUtil {
//	public static void main(String[] a) {
//	
//	Vtu v=new Vtu();
//	v.name="VTU";
//	v.location="karnataka";
//	v.noOfUniversity=30;
//	
//	Reva r=new Reva();
//	r.name="REVA";
//	r.location="Andrapradesh";
//	r.noOfUniversity=50;
//	
//	System.out.println(v.name+" "+v.location+" "+v.noOfUniversity);
//
//}
//}

//initialising contructor in object creation ,
//seter is used to intialize the variable,geter is used to print the variable.
package com.xworkz.Util;

import com.xworkz.Reva;
import com.xworkz.Vtu;

public class UniversityUtil {
	public static void main(String[] a) {
	
	Vtu v=new Vtu("VTU","karnataka",30);
	
	
	Reva r=new Reva("REVA","Andrapradesh",50);
	
	
	System.out.println(v.getName()+" "+v.getLocation()+" "+v.getNoOfUniversity());
	System.out.println(r.getName()+" "+r.getLocation()+" "+r.getNoOfUniversity());

}
}
