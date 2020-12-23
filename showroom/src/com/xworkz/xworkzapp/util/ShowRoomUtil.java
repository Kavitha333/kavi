package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.dto.CarDTO;
import com.xworkz.xworkzapp.showroom.Showroom;

public class ShowRoomUtil {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car array size");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {

			CarDTO carDTO = new CarDTO();
			System.out.println("Enter the " + (i + 1) + "car details :\n");
			System.out.println("Enter the name :");
			String name = sc.next();
			System.out.println("Enter the model name :");
			String modelName = sc.next();
			System.out.println("Enter the price :");
			double price = sc.nextDouble();
			carDTO.setName(name);
			carDTO.setModelName(modelName);
			carDTO.setPrice(price);
			boolean s = showroom.addCars(carDTO);
			System.out.println(s);

		}
		showroom.displaysCars();

//		System.out.println("Enter the price of the car:");    //how to assign
//		double price=sc.next();
//		showroom.showCarDetailsByPrice(price);
		System.out.println("Enter the name of the car:\n");
		String name = sc.next();
		showroom.showCarDetailsByName(name);

		System.out.println("Enter the deleting car:\n");
		String name1 = sc.next();
		showroom.deleteCarByName(name1);

		showroom.displaysCars();

		// System.out.println("Updating car name :\n");
		System.out.println(" updating car name:\n");
		String name2 = sc.next();
		System.out.println("updating car modelname:\n");
		String modelname2 = sc.next();
		System.out.println("updating price:\n");
		double price2 = sc.nextDouble();

		showroom.updateCarByName(name2, modelname2, price2);
		showroom.displaysCars();
		sc.close();

	}
}