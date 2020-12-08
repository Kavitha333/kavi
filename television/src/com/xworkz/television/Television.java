package com.xworkz.television;

public class Television {
	private String name;
	private String brand;
	private  String channel;
	private  double price;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel=channel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
}



