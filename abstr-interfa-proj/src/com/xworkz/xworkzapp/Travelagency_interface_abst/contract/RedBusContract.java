package com.xworkz.xworkzapp.Travelagency_interface_abst.contract;

import java.util.Date;

public interface RedBusContract {
	
	int minBooking();
	
    boolean warrenty();
	
	default  public  void printDate()
	{
		System.out.println(new Date());
	}

}
