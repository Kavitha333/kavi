package com.xworkz.xworkzapp.Travelagency_interface_abst.agency;

import com.xworkz.xworkzapp.Travelagency_interface_abst.contract.RedBusContract;

public class TravelAgency {

	private RedBusContract contract;
	
	public static String name="Sugama Travel pvt Ltd";
	
	public TravelAgency(RedBusContract contract) {
		// TODO Auto-generated constructor stub
		this.contract = contract;
	}
	
	public void acceptBooking()
	{
		System.out.println("inside acceptBooking method");
		boolean warrenty=contract.warrenty();
		if(warrenty)
		{
			   int min=contract.minBooking();
			   if(min >0 && min <=31)
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
