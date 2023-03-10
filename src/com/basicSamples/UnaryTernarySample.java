package com.basicSamples;

public class UnaryTernarySample {

	public static void main(String[] args) {
		int odd = 23;
		String result;
		result = ((odd%2) == 0)? "Even Number" : "Odd Number";
		System.out.println(result);
		int februaryDays = 28;
		result = (februaryDays == 29) ? "Leap Year" : "Not a Leap Year";
		System.out.println(result);

	}

}
