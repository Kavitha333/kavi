package com.xworkz.xworkzapp.monuments;

public class ArtGallery {
	
	public MonumentsDTO[] monumentDTOs;
	public int index;
	public ArtGallery(int size) {
		monumentDTOs = new 	MonumentsDTO[size];
	}
	
	public void addMonuments(MonumentsDTO art) {
	System.out.println("Adding monuments details");
	monumentDTOs[index++] = art;
	System.out.println("Adding all the details");
	}
	
	public void showAllMonuments() {
		for(MonumentsDTO  MonumentsDTO :monumentDTOs ) {
			if(MonumentsDTO != null) {
				System.out.println(MonumentsDTO.getName()+" "+MonumentsDTO.getId());
			}
			else {
				System.out.println("Please add the details");
			}
		}
	}
}
