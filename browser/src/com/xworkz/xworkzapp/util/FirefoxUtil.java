package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.browser.Firefox;

public class FirefoxUtil {
	public static void main(String[] args) {
		Firefox browser = new Firefox();
		browser.name = "Crome";
		browser.speed = "1.7 mbps";
		browser.toBrowse();
		System.out.println(browser.name + " " + browser.speed);
	}

}
