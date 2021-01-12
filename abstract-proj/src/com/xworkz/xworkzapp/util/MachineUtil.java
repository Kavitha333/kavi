package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.machine.Geaser;
import com.xworkz.xworkzapp.machine.VGuard;

public class MachineUtil {
	
	public static void main(String[] args) {
		Geaser machine=new VGuard();//upcasting
		
		machine.onAndOff();
	}

}
