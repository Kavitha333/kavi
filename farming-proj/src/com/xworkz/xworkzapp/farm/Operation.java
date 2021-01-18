package com.xworkz.xworkzapp.farm;

public class Operation // operation
{
	// private static final String FarmDTO = null;
	public FarmDTO[] farmDTOs;
	public int index;

	public Operation(int size) {
		farmDTOs = new FarmDTO[size];
	}

	public void addFarmDetails(FarmDTO farm) {
		System.out.println("adding Farm Details");
		farmDTOs[index++] = farm;
		System.out.println("adding all the farms details");
	}

	public void showAllFarmDetails() {
		for (FarmDTO farmDTO : farmDTOs) {
			if (farmDTO != null) // null check ---id DTO is available inside array that not equal to
			{
				System.out.println(farmDTO.getTypeOfSoil() + "  " + farmDTO.getArea() + " " + farmDTO.getTypeOfCrop());
			} else {
				System.out.println("please add farm details");
			}
		}

	}

	public void showFarmDetailsByCrop(String typeOfCrop) {
		//System.out.println("entering into typeOfCrop");
		for (FarmDTO farmDTO : farmDTOs) {
			if (farmDTO != null) // null check ---id DTO is available inside array that not equal to
			
				if (farmDTO.getTypeOfCrop().equals(typeOfCrop)) {
					System.out.println(farmDTO.getTypeOfCrop() + " "+ farmDTO.getArea() + " "+ farmDTO.getTypeOfSoil()) ; 
				}
			 else 
				System.out.println("not available");
			
			
		}

	}

public void showFarmDetailsBySoil(String  typeOfSoil)   {
	//System.out.println("entering into typeOfSoil");
	for(int i=0;i<farmDTOs.length;i++)  {
		if(farmDTOs[i] != null) //null check ---id DTO is available inside array that not equal to 
		
			if(farmDTOs[i].getTypeOfSoil().equals(typeOfSoil)) 
			System.out.println(farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getTypeOfCrop()+" "+farmDTOs[i].getArea() ); 
			
		 else 
			System.out.println("not available");
		
		
      }

   }

public void showFarmDetailsByArea(String  area)   {
	//System.out.println("entering into Area");
	for(int i=0;i<farmDTOs.length;i++)  {
		if(farmDTOs[i] != null) //null check ---id DTO is available inside array that not equal to 
		
			if(farmDTOs[i].getArea().equals(area)) {
			System.out.println(farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop()+" "+farmDTOs[i].getTypeOfCrop());
		}
		 else {
			System.out.println("not available");
		 }
		 
      }

   }

}
