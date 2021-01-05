package com.xworkz.xworkzapp.mobile;

public class Mobile {

	private int mobileId;
	private String name;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", name=" + name + "]";
	}

	
	  public int hashCode() {
		  return mobileId;
		  }
	  
	  public boolean equals(Object obj) {
		if (obj instanceof Mobile) {
			return true;
		}
		/*
		 * if (this != null) { if (this == obj) { return true; } else if
		 * (this.hashCode() == obj.hashCode()) { return true; } else if
		 * (name.equals(obj)) { return true; }
		 * 
		 * }
		 */
		return false;
	}
}
