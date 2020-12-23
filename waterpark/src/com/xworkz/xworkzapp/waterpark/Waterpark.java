package com.xworkz.xworkzapp;

public class Waterpark {
	
	public ManagerDTO manager;
	//public WaterDTO dto;
	public WorkersDTO[] workersDTOs;
	public int index;
	public void addManager(String name,long contactNo) {
		System.out.println("Adding the mananger by name and contactNo");
		if(name !=null && contactNo > 0)
		this.manager= new ManagerDTO(name, contactNo);
		System.out.println("Added the manager by name and contact ");
	}
	
	public void addManager(WaterParkDTO waterpark) {
		System.out.println("Adding manager directly");
		if(dto != null)
			this.manager = dto;
		else {
			System.out.println("Mananger not added:null");
		}
	}
		
		public void addWorkers(WorkersDTO workersDTO) {
			System.out.println(" ");
			if(workersDTO !=null)
			workersDTOs[indes++]= workersDTO;
		
	}
	
	public void removeManager() {
		this.manager = null;
	}
	
	public void  showWorkersByName(String name) {
		for(int i=0; i < workersDTOs.length ; i++) {
			if(workersDTOs[i] != null) {
				if(workersDTOs[i].getName().equals(name))
				{
					dto=workersDTOs[i];
				}
			}
		}
     return dto;
}
	public void displayTheManager() {
		System.out.println(this.manager.getName());
		System.out.println(this.manager.getContactNo());

	}
}
