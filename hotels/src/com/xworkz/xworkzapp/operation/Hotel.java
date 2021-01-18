package com.xworkz.xworkzapp.operation;

import java.util.Arrays;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.hotels.HotelsDTO;

public class Hotel {

	public HotelsDTO[] hotelsDTO = new HotelsDTO[10];
	public int index;
	

	public Hotel() {
		System.out.println("hotel object is created\n");
	}

	public void acceptMultipleHotelInformation(HotelsDTO hotelsDTO) {
		 
			if (hotelsDTO != null) {
				if (hotelsDTO.getName() != null && hotelsDTO.getLocation() != null
						&& hotelsDTO.getFoodItems() != null) {
					this.hotelsDTO[index++] = hotelsDTO;
					System.out.println(" hotels details added= "+hotelsDTO.getName());

				} else {
					System.out.println(" hotels not added");
				}
			} else if (hotelsDTO == null) {
				System.out.println("hotel not found it is null");
			}
		}
	

	public void searchHotelByLocationAndHotelName(Location location, String hotelName) {
	
		for (int i = 0; i < hotelsDTO.length; i++) {
			if (hotelsDTO[i] != null) {
				if (hotelsDTO[i].getLocation().equals(location) && hotelsDTO[i].getName().equals(hotelName)) {
					
					System.out.println("Searched hotel by location and hotel name is :");
					System.out.println( "hotelname: "+hotelsDTO[i].getName() + "\nhotel location: " + hotelsDTO[i].getLocation() + "\nowner name is: " + hotelsDTO[i].getOwnerName()
							+ "\nservice they provided :" + hotelsDTO[i].getTypeOfService() + " ");
					System.out.println("Food iteams Are:");
					System.out.println(Arrays.toString(hotelsDTO[i].getFoodItems())+"\n");
//					hotelsDTO[i].getFoodItems();
//					for (int j = 0; j < hotelsDTO.length; j++) {
//						System.out.println(hotelsDTO[j].getName());
//					}
					
				} else
					System.out.println("hotel not found");
			} 
//			if(hotelsDTO[i]==null) {
//				System.out.println(); 
//			}
		}
	}

	public void displayAllHotelInformation() {
		for (int i = 0; i < hotelsDTO.length; i++) {
			if (hotelsDTO[i] != null) {
				System.out.println("Displaying all the hotel information");
				System.out.println( "hotelname: "+hotelsDTO[i].getName() + "\nhotel location: " + hotelsDTO[i].getLocation() + "\nowner name is: " + hotelsDTO[i].getOwnerName()
						+ "\nservice they provided :" + hotelsDTO[i].getTypeOfService() + " ");
						}
					}
				}
	

	public String ownerNameByHotelName(String hotelName) {
		String owner = null;
		for (int i = 0; i < hotelsDTO.length; i++) {
			if (hotelsDTO[i] != null) {
				if (hotelsDTO[i].getName().equals(hotelName)) {
					owner = hotelsDTO[i].getOwnerName();
					System.out.println("owner name by hotelName");
					System.out.println(hotelsDTO[i].getOwnerName());
				}
			}
			else if(hotelsDTO[i] == null)
			{
				
			}
		}
		return owner;
	}

}
