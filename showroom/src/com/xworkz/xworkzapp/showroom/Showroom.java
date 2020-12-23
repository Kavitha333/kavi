package com.xworkz.xworkzapp.showroom;

import com.xworkz.xworkzapp.dto.CarDTO;

public class Showroom {

	public CarDTO carDTO[] = new CarDTO[5];
	public int currentIndex;

//	public Showroom() {
//	
//	//System.out.println(this.getClass()+" show room object created");
//	System.out.println("Show room object created");
//
//	}

	public boolean addCars(CarDTO carDTO) {

		boolean added = false;
		if (carDTO != null) {
			System.out.println(this.currentIndex + "   current index  ");
			this.carDTO[currentIndex] = carDTO;
			this.currentIndex++;
			added = true;
			return added;
		} else if (carDTO == null) {
			System.out.println("car dto is not added"); // on what condition it will display
		}
		added = false;
		return added;
	}

	public CarDTO[] displaysCars() {
		CarDTO[] carDTOs = null;
		System.out.println("showing cars details \n");
		for (int i = 0; i < carDTO.length; i++) {
			if (carDTO[i] != null) {
				carDTOs = carDTO;
				System.out.println(carDTO[i].getName() + " " + carDTO[i].getModelName() + " " + carDTO[i].getPrice());
			} else if (carDTO[i] == null) {
				System.out.println("car not avai\n");
			}
		}
		System.out.println("showing cars details\n");
		return carDTOs;
	}

//		 for (CarDTO carDTO2 : carDTO) {
//			if(carDTO2 != null) {
//				 System.out.println(carDTO2.getName());
//
//			}
//		}//another way to use for loop called for each

//	 public void showCarDetailsByPrice(double price) {
//		 for (int i = 0; i < carDTO.length; i++) {
//			if (carDTO[i] != null) {
//				if(carDTO[i].getPrice().equals(price)) {
//				System.out.println(carDTO[i].getPrice()+" "+carDTO[i].getName()+" "+carDTO[i].getModelName());
//			}
//				else {
//					System.out.println("not available");
//				}
//				
//		}
//	 } //here,,,, im getting .not invoke to primitive datatypes

	public void showCarDetailsByName(String name) {
		for (int i = 0; i < carDTO.length; i++) {
			if (carDTO[i] != null) {
				if (carDTO[i].getName().equals(name)) {
					System.out.println(
							carDTO[i].getPrice() + "  " + carDTO[i].getName() + "   " + carDTO[i].getModelName());
				} else {
					System.out.println("not available");
				}

			}
		}
	}

	public void deleteCarByName(String name1) {
		System.out.println("starting with deletig the car bye name:\n");
		for (int i = 0; i < carDTO.length; i++) {
			if (carDTO[i] != null)
				if (carDTO[i].getName().equals(name1)) {
					carDTO[i] = null;
				}
		}

	}

	public void updateCarByName(String name2, String modelname2, double price2) {
		System.out.println("starting with updating the car bye name:\n");
		for (int i = 0; i < carDTO.length; i++) {
			if (carDTO[i] != null) {

				if (carDTO[i].getName().equals(name2)) {
					// carDTO[i].setName(name2);
					// carDTO[i].setModelName(modelname2);
					carDTO[i].setPrice(price2);

					System.out.println("updateded car details : " + carDTO[i].getName() + " " + carDTO[i].getModelName()
							+ " " + carDTO[i].getPrice());

				}
				// System.out.println("updateded car details : "+carDTO[i].getName()+"
				// "+carDTO[i].getModelName()+" "+carDTO[i].getPrice());

			}
		}

	}
}
//						if(carDTO[i].getName().equals(name2)||carDTO[i].getModelName().equals(modelname2)||carDTO[i].getPrice().equals(price2))
//						{
//							carDTO[i].setName(name2);
//							carDTO[i].setModelName(modelname);
//							carDTO[i].setPrice(price2);
////							System.out.println("updateded car details : "+carDTO[i].getName()+" "+carDTO[i].getModelName()+carDTO[i].getPrice());
////						}
//					}
//				}
//			 }

