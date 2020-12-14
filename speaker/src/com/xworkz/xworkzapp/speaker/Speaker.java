package com.xworkz.xworkzapp.speaker;

public class Speaker {
	
	private String color;
	private double price; 
	private static String brandName="Noise";

	private int batteryBackupForHours;
	
	public Speaker(double price , int  batteryBackupForHours ) {
		System.out.println("speaker object created");
		System.out.println("arg 1 is : "+this.price );
		System.out.println("arg 2 is : "+this.batteryBackupForHours );

		this.price=price;
		this.batteryBackupForHours=batteryBackupForHours;
		
		System.out.println("arg 1 is : "+this.price );
		System.out.println("arg 2 is : "+this.batteryBackupForHours );
	}
	
	//properties to defined functionalities
	private int maxVolume = 6;
	private int minVolume = 0;
	private boolean connected=false;
	private int currentVol;
	
	public void onOrOff() {
		System.out.println("inside onOrOff()");
		
		if(isConnected() == false) {
			this.connected = true;
			System.out.println("speaker connected");
		}
		else
			if(isConnected() == true) {
				this.connected = false;
				System.out.println("speaker dis-connected");
			}
	}
	
	
	public void increaseVolume() {
		System.out.println("inside increaseVolume()");
		if(connected == true) {
			if(this.currentVol<this.maxVolume) {
				this.currentVol = this.currentVol+1;
				System.out.println("current vol is : "+this.currentVol);
			}
			else {
				System.out.println("max vol reached");
				
			}
		}
		else {
			System.out.println("dadda speaker is  not connected");
		}
	}
	
	public void decreaseVolume() {
		System.out.println("inside decreaseVolume()");
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
		this.connected = connected;
	}
	public int getBatteryBackupForHours() {
		return batteryBackupForHours;
	}
		
		public double getPrice() {
			return price;
		}
	}

