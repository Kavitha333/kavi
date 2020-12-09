//package com.xworkz.university;
//
//public class University {
//	public String name;
//	public  String location;
//	public long noOfUniversity;
//	
//	public  void provideEducation() {
//		System.out.println("education");
//	}

//using geter seter and construction
	package com.xworkz.university;

	public class University {
		private String name;
		private String location;
		private long noOfUniversity;
		
		public  void provideEducation() {
			System.out.println("education");
		}
		public University(String name,String location,long noOfUniversity) {
			this.name=name;
			this.location=location;
			this.noOfUniversity=noOfUniversity;
			
			
		}
	
	public String getName() {
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


	public long getNoOfUniversity() {
		return noOfUniversity;
	}
	public void setNoOfUniversity(long noOfUniversity) {
		this.noOfUniversity=noOfUniversity;
	}
	
}
