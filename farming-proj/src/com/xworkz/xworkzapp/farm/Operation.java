package com.xworkz.xworkzapp.farm;

public class Operation //operation
   {
	public FarmDTO[] farmDTOs;
	public int index;
	public Operation(int size) {
		farmDTOs=new FarmDTO[size];
	}

	
public void addFarmDetails(FarmDTO farm) {
	System.out.println("adding Farm Details");
	farmDTOs[index++] = farm;
	System.out.println("adding all the farms details");
}

	public void showAllFarmDetails() {
		for(FarmDTO farmDTO : farmDTOs) {
			if(farmDTO != null) //null check ---id DTO is available inside array that not equal to 
			{
				System.out.println(farmDTO.getTypeOfSoil()+"  "+farmDTO.getArea()+" "+farmDTO.getTypeOfCrop());
			} else {
				System.out.println("please add farm deatails");
			}
	}

}
   }
