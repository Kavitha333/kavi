package com.xworkz.tree;

public class Tree {
	private String name;
	private String location;
	private  String species;
	private  double price;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species=species;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
}
