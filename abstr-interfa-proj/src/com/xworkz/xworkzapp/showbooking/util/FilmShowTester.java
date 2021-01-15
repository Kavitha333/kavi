package com.xworkz.xworkzapp.showbooking.util;

import com.xworkz.xworkzapp.showbooking.booking.BookMyShow;
import com.xworkz.xworkzapp.showbooking.showinterface.FilmShow;
import com.xworkz.xworkzapp.showbooking.showinterface.FilmShowBooking;

public class FilmShowTester {
	public static void main(String[] args) {
		FilmShowBooking  filmShowBooking=new FilmShow();
		
		BookMyShow bookMyShow=new BookMyShow(filmShowBooking);
		bookMyShow.acceptBooking();
	}

}
