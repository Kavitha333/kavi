/*package com.xworkz;

import com.xworkz.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] a) {
		SteelIndustry industry=new SteelIndustry();
		industry.area="banglore";
		industry.noOfWorkers=234;
		industry.type="manufacturing";
		
		System.out.println(industry.area+" "+industry.noOfWorkers+" "+industry.type);
	}

}
*/
package com.xworkz;

import com.xworkz.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] a) {
		SteelIndustry industry=new SteelIndustry("manufacturing",22,"HSR layout");
	
		System.out.println(industry.getArea()+" "+industry.getNoOfWorkers()+" "+industry.getArea());
	}
	
}