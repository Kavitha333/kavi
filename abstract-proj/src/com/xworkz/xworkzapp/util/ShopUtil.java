package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.shop.Automobile;
import com.xworkz.xworkzapp.shop.Bakery;
import com.xworkz.xworkzapp.shop.Shop;

public class ShopUtil {
	public static void main(String[] args) {
		Shop automobileShop=new Automobile();
		automobileShop.serve();
		automobileShop.store();
		Shop bakery=new Bakery();
		bakery.serve();
	    bakery.store();
	}

}
