package com.xworkz.xworkzapp.showbooking.booking;

import com.xworkz.xworkzapp.showbooking.showinterface.FilmShowBooking;

public class BookMyShow {
	private FilmShowBooking seat;
	
	public  BookMyShow(FilmShowBooking seat) {
		this.seat=seat;
	}
	
	public void acceptBooking() {
		System.out.println("inside accept booking method");
		
		boolean seatAvailable=seat.seatAvailable();
		if(seatAvailable) {
			
			int minBooking=seat.provideSeat();
			if(minBooking>0 && minBooking<=31) 
				 {
					   System.out.println("accept the booking");
				   }
				   else {
					   System.out.println("cannot accept booking");
				   }
			}
			else {
				System.out.println("no warrenty hence cancelling booking");
			}
			
		}
	}
		