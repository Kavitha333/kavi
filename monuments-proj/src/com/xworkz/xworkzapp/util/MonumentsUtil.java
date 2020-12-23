package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.monuments.ArtGallery;
import com.xworkz.xworkzapp.monuments.MonumentsDTO;

public class MonumentsUtil {
	public static void main(String[] args) {
		
		ArtGallery artGallery = new ArtGallery(3);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	
	for(int i=0;i<size;i++) {
		MonumentsDTO monuments = new MonumentsDTO();
		System.out.println("Enter the"+(i+1)+" details" );
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the id");
		String id = sc.next();
		monuments.setName(name);
		monuments.setId(id);
		artGallery.addMonuments(monuments);
	
	}
	artGallery.showAllMonuments();
	sc.close();

	}
}
