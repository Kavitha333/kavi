package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.farm.FarmDTO;
import com.xworkz.xworkzapp.farm.Operation;

public class FarmUtil {
	public static void main(String[] a) {
		
//		FarmDTO farmOne=new FarmDTO("black","2 acre","peanuts");
//		FarmDTO farmTwo=new FarmDTO("black","2 acre","peanuts");
//	//	FarmDTO farmThree=new FarmDTO("black","2 acre","peanuts");
		
		Operation operation =new Operation(2);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Farm size");
	    
		int size=sc.nextInt();
		for(int i=0; i<size;i++) {
			FarmDTO dto=new FarmDTO();
			System.out.println("Enter the"+ (i+1) +"Farm Deatails");
			System.out.println("Enter the type of soil");
			String typeOfSoil=sc.next();
			System.out.println("Enter the type Area");
			String area=sc.next();
			System.out.println("Enter the type of crop");
			String typeOfCrop=sc.next();
			
			
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
					
		     operation.addFarmDetails(dto);
		
	}
    operation.showAllFarmDetails();
    sc.close();
}
}
