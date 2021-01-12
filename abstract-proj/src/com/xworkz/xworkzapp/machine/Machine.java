package com.xworkz.xworkzapp.machine;

public abstract class Machine {
	
	public abstract void onAndOff();
	
	public void performTask() //Concrete  method
	{
	 System.out.println("");
	}
	
}

//partial representation =abstract method +concrete method