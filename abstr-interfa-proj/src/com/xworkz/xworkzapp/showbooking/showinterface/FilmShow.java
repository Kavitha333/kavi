package com.xworkz.xworkzapp.showbooking.showinterface;

public class FilmShow implements FilmShowBooking {
	public boolean seatAvailable() {
		return true;
	}
	
	public int provideSeat() {
		return 33;
	}

}
