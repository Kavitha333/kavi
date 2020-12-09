package com.xworkz.country;

public class Country {
	private int noOfStates;
	private int noOfLanguages;
	private String capitals;
	
	
	public void develop() {
		System.out.println("developing country");
	}
	public Country(int noOfStates, int noOfLanguages,String capitals) {
		this.noOfStates=noOfStates;
		this.noOfLanguages=noOfLanguages;
		this.capitals=capitals;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates=noOfStates;
	}
	public int getNoOfLanguages() {
		return noOfLanguages;
	}
	public void setNoOfLanguages(int noOfLanguages) {
		this.noOfLanguages=noOfLanguages;
	}
	public String getCapitals() {
		return capitals;
	}
	public void setCapitals(String capitals) {
		this.capitals=capitals;
	}
	
}
