package com.xworkz.xworkzapp.waterpark;

public class WaterParkDTO {
		private String rides;
		private ManagerDTO manager;
		private WorkersDTO[] workers;       //as a relationship(4 types) (class which as 
        									//reference of another class. it can be one or many)
											//1)one to many  2)one to many relationship.
										    //laptop----one laptop one ram ( 1 to 1).
										    //hospital have many patients(1 to 2).
	public String getRides() {
	return rides;
   }
   public void setRides(String rides) {
	this.rides=rides;
   }

   public ManagerDTO getPhoneNum() {
	return manager;
   }
   public void setManager(ManagerDTO manager) {
	this.manager=manager;
    }		
   public WorkersDTO[] getWorkers() {
		return workers;
	   }
	   public void setWorkers(WorkersDTO[] workers) {
		this.workers=workers;
	    }		

}