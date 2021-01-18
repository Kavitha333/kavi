package com.xworkz.xworkzapp.human;

public class Human {
	private String name;
	private int age;
	private int adharNumber;

	public int getAge() {
		return age;
	}

	// implicit tostring

	// System.out.println("implicit toString");

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return adharNumber;
	}

	@Override
	public boolean equals(Object obj) {
		// if(obj !=null) {
		// this is nothing but Human(class)
		
	if(obj instanceof Human)  //type comparization
		{
			return true;
		}
		/*if (this == obj) {
			return true;
		}

		if (obj == null) {
			System.out.println("object is null");
			return true;
		}
		if (obj.hashCode() == this.hashCode()) {
			return true;
		}
		if (this.name.equals(obj)) {
			return true;
		}
	 }*/
		return false;

	}
}
