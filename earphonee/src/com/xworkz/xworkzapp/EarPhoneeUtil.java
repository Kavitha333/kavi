package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.earphonee.EarPhonee;

public class EarPhoneeUtil {
	public static void main(String[] args) {
		
		EarPhonee earPhonee = new EarPhonee(2000.00,9);
		System.out.println(earPhonee.getBatteryBackupForHours());
		System.out.println(earPhonee.isConnected());
		
		earPhonee.increaseVolume();
		earPhonee.onOrOff();
		earPhonee.increaseVolume();
		earPhonee.increaseVolume();
		earPhonee.increaseVolume();
		earPhonee.increaseVolume();
		earPhonee.increaseVolume();

}
}
