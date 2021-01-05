package com.xworkz.xworkzapp.laptop;

public class Laptop {
	private double price;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", name=" + name + "]";
	}

	public int hashcode() {
		return (int) price;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Laptop) {
			return true;
		}
		if (this == obj) {
			return true;
		}
		else if (this.hashcode() == obj.hashCode()) {
			return true;
		}
		else
		{
			
		}
		return false;
	}

}
