package com.xworkz.xworkzapp.earphonee;

public class EarPhonee {
	
	private double price;
	private int batteryBackupForHours;
	
	public EarPhonee(double price,int batteryBackupForHours) {
		System.out.println("speaker object created");
		System.out.println("arg 1 is : "+this.price);
		System.out.println("arg 2 is : "+this.batteryBackupForHours);
		
		this.price=price;
		this.batteryBackupForHours=batteryBackupForHours;
		
		System.out.println("arg 1 is : "+this.price);
		System.out.println("arg 2 is : "+this.batteryBackupForHours);
		
	}
	
	//properties to defined functionalities
	private int maxVolume=6;
	private int minVolume=0;
	private boolean connected=false;
	 private int currentVol;
	
	public void onOrOff() {
		System.out.println("Inside onOrOff()");
		if(isConnected() == false) {
			this.connected = true;
			System.out.println("earphone connected");
		}
		else 
			if(isConnected() == true) {
				this.connected = false;
				System.out.println("speaker disconnected");
			}
	}
	
	public void increaseVolume() {
		System.out.println("Inside increaseVolume()");
		if(connected == true) {
			if(this.currentVol<this.maxVolume) {
				this.currentVol=this.currentVol+1;
				System.out.println("current vol is : "+this.currentVol);
			}
			else
			{
				System.out.println("max vol reached");
			}
		}
		else {
			System.out.println("dabba earphines is not connected");
		}
	}
	public void decreaseVolume() {
		System.out.println("inside decreasevolume()");
		if(connected == true) {
			if(this.currentVol>this.minVolume) {
				this.currentVol = this.currentVol-1;
				System.out.println("current vol is : "+this.currentVol);
			}
			else {
				System.out.println("min vol reached");
			}
		}
	}
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected=connected;
	}
	public int getBatteryBackupForHours() {
		return batteryBackupForHours;
	}
	public double getPrice() {
		return price;
	}

}
