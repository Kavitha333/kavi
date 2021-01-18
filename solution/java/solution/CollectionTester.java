package solution;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionTester {
	public static void main(String[] args) {

		String cadbury = "DairyMilk";
		String campco = "milkybar";
		String nestle = "kitkat";
		String parle = "kiss me";
		String amul = "Dark chacolate";

		Collection chocolates = new ArrayList();
		System.out.println(" using parents collection / Adding elements ");
		chocolates.add(cadbury);
		chocolates.add(campco);
		chocolates.add(nestle);
		chocolates.add(parle);
		chocolates.add(amul);

		System.out.println(chocolates);
		int totalElement = chocolates.size();
		
		System.out.println("totalelement : " + totalElement);
		List chocolatesList = new ArrayList();
		
		System.out.println("\nArraylist implemets the list / Adding elements ");
		chocolatesList.add(cadbury);
		chocolatesList.add(campco);
		chocolatesList.add(nestle);
		int totalElements = chocolatesList.size();
		System.out.println("totalelement : " + totalElements);

		

	}
}
