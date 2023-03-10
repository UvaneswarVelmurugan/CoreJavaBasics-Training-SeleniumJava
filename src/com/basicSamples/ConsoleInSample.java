package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer : ");
		int number = input.nextInt();
		System.out.println("number : "+number);
		
		System.out.println("Enter Float : ");
		float myFloat = input.nextFloat();
		System.out.println("Enter an Integer : "+myFloat);
		
		System.out.println("Enter Double : ");
		double myDouble = input.nextDouble();
		System.out.println("Text : "+myDouble);
		
		System.out.println("Enter Text : ");
		String myString = input.next();
		System.out.println("Text : "+myString);
		
		input.close();

	}

}
