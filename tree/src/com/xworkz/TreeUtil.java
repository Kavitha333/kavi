package com.xworkz;

import com.xworkz.tree.Tree;

public class TreeUtil {
	
	public static void main(String[] a) {
		Tree t=new Tree();
		t.setName("Sacred fig");
		t.setLocation("karnataka");
		t.setSpecies("banyan(ficus benghalenis)");
		t.setPrice(80.00);
		System.out.println(t.getName()+"\n"+t.getLocation()+"\n"+t.getSpecies()+"\n"+t.getPrice());
	}

}
