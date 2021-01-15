package com.xworkz.xworkzapp.Travelagency_interface_abst.util;

import com.xworkz.xworkzapp.Travelagency_interface_abst.agency.TravelAgency;
import com.xworkz.xworkzapp.Travelagency_interface_abst.contract.RedBusContract;
import com.xworkz.xworkzapp.Travelagency_interface_abst.contract.RedBusContractImpl;

public class AgencyTester {
	
	public static void main(String[] args) {
		
		RedBusContract busContract = new RedBusContractImpl();
		busContract.printDate();
		busContract.minBooking();
		
		// Abstraction
		TravelAgency agency = new TravelAgency(busContract);
		//System.out.println(agency);
		agency.acceptBooking();
	}

}
