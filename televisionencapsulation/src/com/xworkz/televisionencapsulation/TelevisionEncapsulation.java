package com.xworkz.televisionencapsulation;

public class TelevisionEncapsulation {
	
	private String name;
	private String channel;
	private double price;
	
	public   TelevisionEncapsulation(String name,String channel,double price)
	{
		this.name=name;
		this.channel=channel;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
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
