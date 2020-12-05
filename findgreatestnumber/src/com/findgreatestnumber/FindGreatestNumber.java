package com.findgreatestnumber;

public class FindGreatestNumber {
	public static void main(String a[])
	{
		int value=maxOfTwoNumber(420,840);
		System.out.println(value);
	}
	static int maxOfTwoNumber(int firstNumber,int secondNumber)
	{
		if(firstNumber>secondNumber)
			return firstNumber;
		else
			return secondNumber;
	}

}
