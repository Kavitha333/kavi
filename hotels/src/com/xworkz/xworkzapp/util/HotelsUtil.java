package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.hotels.HotelsDTO;
import com.xworkz.xworkzapp.operation.Hotel;

public class HotelsUtil {
	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		HotelsDTO hotelsDTO = new HotelsDTO();
		String ownerName = "ambanii";
		String typeOfService = "Homedelivery";
		String foodIteams[] = { "egg", "rice", "lemonrice", "curdrice", "veg-palav", "vegatable palav", "gobii",
				"nudles", "coldjuice" };
		hotelsDTO.setName("A2B");
		hotelsDTO.setLocation(Location.Bangalore);
		hotelsDTO.setOwnerName(ownerName);
		hotelsDTO.setTypeOfService(typeOfService);
		hotelsDTO.setFoodItems(foodIteams);
		hotel.acceptMultipleHotelInformation(hotelsDTO);
		// hotel.displayAllHotelInformation();
		// hotel.searchHotelByLocationAndHotelName(Location.Bangalore, "A2B");
		// hotel.ownerNameByHotelName("ambaniii");

		HotelsDTO hotelsDTOOne = new HotelsDTO();
		String hotelNameOne = "srigirii";
		String ownerNameOne = "sudarshan";
		String typeOfServiceOne = "providefood";
		String foodIteamsOne[] = { "egg", "rice", "lemonrice", "curdrice", "veg-palav", "vegatable palav", "gobii",
				"nudles", "coldjuice" };
		hotelsDTOOne.setName(hotelNameOne);
		hotelsDTOOne.setLocation(Location.hassan);
		hotelsDTOOne.setOwnerName(ownerNameOne);
		hotelsDTOOne.setTypeOfService(typeOfServiceOne);
		hotelsDTOOne.setFoodItems(foodIteamsOne);
		hotel.acceptMultipleHotelInformation(hotelsDTOOne);
		// hotel.displayAllHotelInformation();
		// hotel.searchHotelByLocationAndHotelName(Location.mysore, "kings'l grand");
		// hotel.ownerNameByHotelName("sudarshan");

		HotelsDTO hotelsDTOTwo = new HotelsDTO();
		String hotelNameTwo = "srigirii";
		String ownerNameTwo = "sagar";
		String typeOfServiceTwo = "homedelivery";
		String foodIteamsTwo[] = { "egg", "rice", "lemonrice", "curdrice", "veg-palav", "vegatable palav", "gobii",
				"nudles", "coldjuice" };
		hotelsDTOTwo.setName(hotelNameTwo);
		hotelsDTOTwo.setLocation(Location.hassan);
		hotelsDTOTwo.setOwnerName(ownerNameTwo);
		hotelsDTOTwo.setTypeOfService(typeOfServiceTwo);
		hotelsDTOTwo.setFoodItems(foodIteamsTwo);
		hotel.acceptMultipleHotelInformation(hotelsDTOTwo);

		hotel.displayAllHotelInformation();
		hotel.searchHotelByLocationAndHotelName(Location.hassan, "srigirii");
		//hotel.ownerNameByHotelName("sagar");

	}

}
